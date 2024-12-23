package com.javarush.balykova.actions;

import com.javarush.balykova.constants.Constants;
import com.javarush.balykova.constants.ResultStatuses;
import com.javarush.balykova.controller.Action;
import com.javarush.balykova.exception.AppCustomException;
import com.javarush.balykova.util.FilePathBuilder;
import com.javarush.balykova.constants.AlphabetBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public abstract class AbstractAct implements Action {

    public Result changeText(String input, String output, int step){
        Path inputFile = FilePathBuilder.getFilePath(input);
        Path outputFile = FilePathBuilder.getFilePath(output);

        try (
                BufferedReader reader = Files.newBufferedReader(inputFile);
                BufferedWriter writer = Files.newBufferedWriter(outputFile)
        ) {
            List<String> strings = reader.lines().toList();
            char[] chars;

            for (String string : strings) {
                chars = string.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    for (int j = 0; j < AlphabetBuilder.CHARS.length; j++) {
                        if (chars[i] == AlphabetBuilder.CHARS[j]) {
                            chars[i] = AlphabetBuilder.CHARS[(j + step - 1) % AlphabetBuilder.CHARS.length];
                            break;
                        }
                    }

                }
                writer.write(chars);
            }

        } catch (IOException e) {
            throw new AppCustomException(Constants.WRONG_FILE + e.getMessage() + e);
        }
        return new Result(ResultStatuses.FINISHED_SUCCESS, output);
    }

}

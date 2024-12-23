package com.javarush.balykova.actions;

import com.javarush.balykova.constants.AlphabetBuilder;
import com.javarush.balykova.constants.Constants;
import com.javarush.balykova.exception.AppCustomException;
import com.javarush.balykova.util.FilePathBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BruteForceAct extends AbstractAct{
    @Override
    public Result execute(String[] parameters){
        String input = parameters[0];
        String output = parameters[1];

        int bestKey = 0;
        int bestSpaceCount = 0;
        char space = ' ';
        for (int key = 0; key < AlphabetBuilder.CHARS.length; key++) {
            int spaceCount = countCharInFileWithKey(input, key, space);
            if (spaceCount > bestSpaceCount) {
                bestSpaceCount = spaceCount;
                bestKey = key;
            }
        }
        return changeText(input, output, bestKey);
    }

    private int countCharInFileWithKey(String input, int key, char fixChar) {
        int spaceCount = 0;
        Path path = FilePathBuilder.getFilePath(input);
        char[] chars = AlphabetBuilder.CHARS;
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            int value;
            while ((value = reader.read()) > -1) {
                char character = (char) value;
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == character) {
                        int index = i;
                        index = (index + key + AlphabetBuilder.CHARS.length) % AlphabetBuilder.CHARS.length;
                        if (AlphabetBuilder.CHARS[index] == fixChar) {
                            spaceCount++;
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new AppCustomException(Constants.WRONG_FILE + input, e);
        }
        return spaceCount;
    }
}

package com.javarush.balykova.util;

import com.javarush.balykova.constants.Constants;

import java.io.File;
import java.nio.file.Path;

public class FilePathBuilder {

    public static final String TXT_FOLDER = System.getProperty(Constants.BASE_DIR)
            + File.separator
            + Constants.BASE_FILE
            +File.separator;

    public static Path getFilePath(String fileName) {
        Path path = Path.of(fileName);
        return path.isAbsolute()
                ? path
                : Path.of(TXT_FOLDER + fileName);
    }
}

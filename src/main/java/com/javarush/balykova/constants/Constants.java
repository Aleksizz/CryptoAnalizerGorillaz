package com.javarush.balykova.constants;

public interface Constants {

    String BASE_DIR = "user.dir";
    String BASE_FILE = "text";
    String NOT_FOUND_ACTION_FORMAT = "not found action: %s";
    String WRONG_FILE = "Incorrect file: ";
    String OK = "OK";
    String INCORRECT_SELECTION = "Incorrect selection";
    String JUST_FINISH_NO_CHANGES = "Just finish & No changes";
    String MESSAGE_SELECT_MODE = """
            Write the command and Press Enter:
            1 for simple encode
            2 for simple decode
            3 for bruteForce
            4 to exit""";
    String DEFAULT_ALPHABET_RUS = "ЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮ";
    String DEFAULT_SYMBOLS = "\n☮.,”’:-!? ";
    String DEFAULT_NUMS = "0123456789";
    String SOURCE_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE = "write the name of SourceFile with format or press Enter to default file ";
    String DESTINATION_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE = "write the name of DestinationFile with format or press Enter to default file ";
    String KEY_FOR_CHANGING_TEXT = "Enter key (int number OR Enter for key=1) ";
}

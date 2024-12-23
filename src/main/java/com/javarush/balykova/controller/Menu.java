package com.javarush.balykova.controller;

import com.javarush.balykova.constants.Constants;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String[] getArgs() {
        int mode = getMode(scanner);
        String[] args = new String[3];

        if(mode == 0) {
            System.out.println(Constants.SOURCE_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE);
            String answer = scanner.nextLine();
            args[0] = answer.trim().isEmpty() ? "text.txt" : answer;
            System.out.println(Constants.DESTINATION_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE);
            answer = scanner.nextLine();
            args[1] = answer.trim().isEmpty() ? "encrypted.txt" : answer;
            System.out.println(Constants.KEY_FOR_CHANGING_TEXT);
            answer = scanner.nextLine();
            args[2] = answer.trim().isEmpty() ? "1" : answer;
        } else if (mode == 1) {
            System.out.println(Constants.SOURCE_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE);
            String answer = scanner.nextLine();
            args[0] = answer.trim().isEmpty() ? "encrypted.txt" : answer;
            System.out.println(Constants.DESTINATION_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE);
            answer = scanner.nextLine();
            args[1] = answer.trim().isEmpty() ? "text.txt" : answer;
            System.out.println(Constants.KEY_FOR_CHANGING_TEXT);
            answer = scanner.nextLine();
            args[2] = answer.trim().isEmpty() ? "1" : answer;
        } else if (mode == 2) {
            System.out.println(Constants.SOURCE_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE);
            String answer = scanner.nextLine();
            args[0] = answer.trim().isEmpty() ? "encrypted.txt" : answer;
            System.out.println(Constants.DESTINATION_FILE_WITH_FORMAT_OR_PRESS_ENTER_TO_DEFAULT_FILE);
            answer = scanner.nextLine();
            args[1] = answer.trim().isEmpty() ? "text.txt" : answer;
            args[2] = "0";
        }
        return args;
    }

    private static int getMode(Scanner scanner) {
        int mode;
        do {
            System.out.println(Constants.MESSAGE_SELECT_MODE);
            String input = scanner.nextLine();
            mode = switch (input) {
                case "1" -> 0;
                case "2" -> 1;
                case "3" -> 2;
                case "4" -> 3;

                default -> {
                    System.out.println(Constants.INCORRECT_SELECTION);
                    yield -1;
                }
            };
        } while (mode < 0);
        return mode;
    }
}

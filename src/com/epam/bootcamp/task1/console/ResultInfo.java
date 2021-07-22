package com.epam.bootcamp.task1.console;

public class ResultInfo {
    public static void printResult(int number) {
        if (number != 0) {
            System.out.printf("\nYou need to flip %d coins.", number);
        } else {
            System.out.println("\nAll coins show the same side.");
        }
    }
}

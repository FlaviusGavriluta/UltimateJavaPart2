package org.example.Section3Refactoring.Finish.MortgageCalculator;

import java.util.Scanner;

import static java.lang.System.*;

public class Console {
    private static Scanner scanner = new Scanner(in);

    public static double readNumber(String prompt) {
        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            out.print(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max)
                break;
            out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}

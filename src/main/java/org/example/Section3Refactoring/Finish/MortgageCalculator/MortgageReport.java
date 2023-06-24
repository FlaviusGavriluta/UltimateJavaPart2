package org.example.Section3Refactoring.Finish.MortgageCalculator;

import java.text.NumberFormat;

import static java.lang.System.*;

public class MortgageReport {

    private static MortgageCalculator calculator;

    public static void printMortgage(int principal, float annualInterest, byte years) {
        calculator = new MortgageCalculator(principal, annualInterest, years);
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        out.println();
        out.println("MORTGAGE");
        out.println("--------");
        out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        out.println();
        out.println("PAYMENT SCHEDULE");
        out.println("----------------");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
            double balance = calculator.calculateBalance(month);
            out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}

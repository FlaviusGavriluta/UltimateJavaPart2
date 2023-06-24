package org.example.Section3Refactoring.Finish.MortgageCalculator;

import java.text.NumberFormat;

import static java.lang.System.*;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void printPaymentSchedule() {
        out.println();
        out.println("PAYMENT SCHEDULE");
        out.println("----------------");
        for (double balance : calculator.getRemainingBalances())
            out.println(NumberFormat.getCurrencyInstance().format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        out.println();
        out.println("MORTGAGE");
        out.println("--------");
        out.println("Monthly Payments: " + mortgageFormatted);
    }
}

package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        return taxableIncome * 0.4;
    }
}

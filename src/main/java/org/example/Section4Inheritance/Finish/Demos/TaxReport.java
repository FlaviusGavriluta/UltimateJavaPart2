package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;

public class TaxReport {
    private TaxCalculator calculator;

//    public TaxReport(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        out.println(tax);
    }

//    public void setCalculator(TaxCalculator calculator) {
//        this.calculator = calculator;
//    }
}

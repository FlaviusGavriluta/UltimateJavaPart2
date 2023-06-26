package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;
public class TaxReport {
    private TaxCalculator calculator;
    public TaxReport(){
        calculator=new TaxCalculator(100_000);
    }
    public void  show(){
        var tax = calculator.calculateTax();
        out.println(tax);
    }
}

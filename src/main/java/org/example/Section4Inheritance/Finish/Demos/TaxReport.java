package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;
public class TaxReport {
    private TaxCalculator2018 calculator;
    public TaxReport(){
        calculator=new TaxCalculator2018(100_000);
    }
    public void  show(){
        var tax = calculator.calculateTax();
        out.println(tax);
    }
}

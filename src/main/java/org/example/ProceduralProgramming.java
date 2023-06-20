package org.example;

import static java.lang.System.*;

public class ProceduralProgramming {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        out.println(wage);
        var browser = new Browser();
        browser.navigate("http://www.google.com");
    }
}

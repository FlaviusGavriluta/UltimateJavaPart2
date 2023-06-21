package org.example;

import static java.lang.System.*;

public class ProceduralProgramming {
    public static void main(String[] args) {
//        new Employee(70_000);
        var employee = new Employee(
                50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();
        out.println(wage);
        var browser = new Browser();
        browser.navigate("http://www.google.com");
    }
}

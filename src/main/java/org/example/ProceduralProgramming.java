package org.example;

import static java.lang.System.*;

public class ProceduralProgramming {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        out.println(wage);
    }
}

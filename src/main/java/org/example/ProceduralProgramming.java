package org.example;

import static java.lang.System.*;

public class ProceduralProgramming {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = Calculate.calculateWage(baseSalary, extraHours, hourlyRate);
        out.println(wage);
    }
}

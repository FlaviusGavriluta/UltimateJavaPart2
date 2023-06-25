package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        out.println(point1.hashCode());
        out.println(point2.hashCode());
    }
}

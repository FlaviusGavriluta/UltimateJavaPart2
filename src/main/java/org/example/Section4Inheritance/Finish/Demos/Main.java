package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        var control = new TextBox();
        control.disable();
        var obj = new Object();
        var box1 = new TextBox();
        var box2 = box1;

        out.println(control.isEnabled());
        out.println(obj.toString());
        out.println(box1.toString());
        out.println(box1.hashCode());
        out.println(box2.hashCode());
        out.println(box1.equals(box2));
    }
}

package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls) control.render();
    }
}

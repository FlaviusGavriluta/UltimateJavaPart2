package org.example.Section4Inheritance.Finish.Demos;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl();
        var textBox = new TextBox();
        textBox.setText("Hello World");
        control.disable();
        out.println(control.isEnabled());
        out.println(textBox.isEnabled());
    }
}

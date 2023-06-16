package org.example;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        out.println(textBox2.text.toUpperCase());

    }
}
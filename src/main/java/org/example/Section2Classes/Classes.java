package org.example.Section2Classes;

import org.example.Section2Classes.TextBox;

import static java.lang.System.*;

public class Classes {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        out.println(textBox2.text.toUpperCase());

        var textBox3 = textBox2;
        textBox3.setText("Box 3");
        out.println(textBox2.text);
    }
}
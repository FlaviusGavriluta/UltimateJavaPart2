package org.example;

import static java.lang.System.*;

public class TextBox {
    public String text = ""; // field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}

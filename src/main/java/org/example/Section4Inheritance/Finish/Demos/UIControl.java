package org.example.Section4Inheritance.Finish.Demos;

public class UIControl {
    private boolean isEnabled = true;

//  public UIControl(boolean isEnabled) {
//    this.isEnabled = isEnabled;
//  }

    //public abstract void render();
    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}

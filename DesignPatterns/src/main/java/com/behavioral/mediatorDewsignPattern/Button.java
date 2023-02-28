package com.behavioral.mediatorDewsignPattern;

public class Button extends UIControl{
    private boolean isEnables;

    public Button(DioalogBox owner) {
        super(owner);
    }
    public boolean isEnables() {
        return isEnables;
    }

    public void setEnables(boolean enables) {
        isEnables = enables;
        owner.changed(this);
    }
}

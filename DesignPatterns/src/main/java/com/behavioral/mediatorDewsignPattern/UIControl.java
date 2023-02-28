package com.behavioral.mediatorDewsignPattern;

public class UIControl {
    protected DioalogBox owner;

    public UIControl(DioalogBox owner) {
        this.owner = owner;
    }

    public UIControl() {
    }
}

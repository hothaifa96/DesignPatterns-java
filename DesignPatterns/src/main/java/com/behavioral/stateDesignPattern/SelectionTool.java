package com.behavioral.stateDesignPattern;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("area selected");
    }
}

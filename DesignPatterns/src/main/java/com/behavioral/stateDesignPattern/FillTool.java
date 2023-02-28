package com.behavioral.stateDesignPattern;

public class FillTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("fill icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("fill the page with color");
    }
}

package com.statePattern;

public class DrawTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("draw icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("draw line");
    }
}

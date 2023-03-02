package com.creational.AbstractFActoryDesignPattern.ant.materials;

import com.creational.AbstractFActoryDesignPattern.Button;
import com.creational.AbstractFActoryDesignPattern.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("ant  textbox" );
    }
}

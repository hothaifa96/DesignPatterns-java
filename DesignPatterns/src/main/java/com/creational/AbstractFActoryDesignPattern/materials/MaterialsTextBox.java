package com.creational.AbstractFActoryDesignPattern.materials;

import com.creational.AbstractFActoryDesignPattern.Button;
import com.creational.AbstractFActoryDesignPattern.TextBox;

public class MaterialsTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material textbox" );
    }
}

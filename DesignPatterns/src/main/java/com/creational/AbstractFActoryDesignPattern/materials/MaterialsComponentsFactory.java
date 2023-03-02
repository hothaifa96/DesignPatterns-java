package com.creational.AbstractFActoryDesignPattern.materials;

import com.creational.AbstractFActoryDesignPattern.Button;
import com.creational.AbstractFActoryDesignPattern.ComponentFactory;
import com.creational.AbstractFActoryDesignPattern.TextBox;

public class MaterialsComponentsFactory implements ComponentFactory {
    @Override
    public Button createButton() {
        return new MaterialsButton();
    }

    @Override
    public TextBox createTExtbox() {
        return new MaterialsTextBox();
    }
}

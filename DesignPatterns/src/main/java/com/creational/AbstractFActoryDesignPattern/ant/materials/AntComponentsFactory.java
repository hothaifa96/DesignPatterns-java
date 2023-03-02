package com.creational.AbstractFActoryDesignPattern.ant.materials;

import com.creational.AbstractFActoryDesignPattern.Button;
import com.creational.AbstractFActoryDesignPattern.ComponentFactory;
import com.creational.AbstractFActoryDesignPattern.TextBox;
import com.creational.AbstractFActoryDesignPattern.materials.MaterialsButton;
import com.creational.AbstractFActoryDesignPattern.materials.MaterialsTextBox;

public class AntComponentsFactory implements ComponentFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTExtbox() {
        return new AntTextBox();
    }
}

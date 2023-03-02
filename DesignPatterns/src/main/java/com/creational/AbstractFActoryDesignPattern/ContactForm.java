package com.creational.AbstractFActoryDesignPattern;

import com.creational.AbstractFActoryDesignPattern.ant.materials.AntButton;
import com.creational.AbstractFActoryDesignPattern.ant.materials.AntTextBox;
import com.creational.AbstractFActoryDesignPattern.materials.MaterialsButton;
import com.creational.AbstractFActoryDesignPattern.materials.MaterialsTextBox;

public class ContactForm {
    public void render(ComponentFactory factory){
        factory.createButton().render();
        factory.createTExtbox().render();

    }
}

package com.creational.AbstractFActoryDesignPattern;

import com.creational.AbstractFActoryDesignPattern.Button;
import com.creational.AbstractFActoryDesignPattern.TextBox;

public interface ComponentFactory {
    Button createButton();
    TextBox createTExtbox();
}

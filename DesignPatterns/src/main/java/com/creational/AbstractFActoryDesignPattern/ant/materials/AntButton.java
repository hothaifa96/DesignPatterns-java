package com.creational.AbstractFActoryDesignPattern.ant.materials;

import com.creational.AbstractFActoryDesignPattern.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("ant button");
    }
}

package com.creational.AbstractFActoryDesignPattern.materials;

import com.creational.AbstractFActoryDesignPattern.Button;

public class MaterialsButton implements Button {
    @Override
    public void render() {
        System.out.println("Material button");
    }
}

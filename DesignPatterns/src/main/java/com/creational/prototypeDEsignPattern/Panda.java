package com.creational.prototypeDEsignPattern;

public class Panda implements Component {
    private double size;


    public double getSize() {
        return size;
    }

    public Panda(double size) {
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void render() {
        System.out.println("Damn its a huge panda "+size);
    }

    @Override
    public Component clone() {
        var panda2 = new Panda(size);
        return panda2;
    }
}

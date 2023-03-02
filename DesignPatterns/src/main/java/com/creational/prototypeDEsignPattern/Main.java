package com.creational.prototypeDEsignPattern;

public class Main {
    public static void main(String[] args) {
        var panda = new Panda(77);
        panda.render();

        var cntext = new ContextMenu();
        cntext.duplicate(panda);
        cntext.duplicate(panda);
        cntext.duplicate(panda);
    }
}

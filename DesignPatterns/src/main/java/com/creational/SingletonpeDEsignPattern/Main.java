package com.creational.SingletonpeDEsignPattern;

public class Main {
    public static void main(String[] args) {
        var panda = new Panda(77);
        panda.render();

        var cntext = ContextMenu.getInstance();
        var cntext3 = ContextMenu.getInstance();
        var cntext4 = ContextMenu.getInstance();
        cntext.duplicate(panda);
        cntext.duplicate(panda);
        cntext.duplicate(panda);
        System.out.println(cntext3);
        System.out.println(cntext4);
        System.out.println(cntext);
    }
}

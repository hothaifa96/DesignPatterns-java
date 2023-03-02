package com.creational.prototypeDEsignPattern;

public class ContextMenu {
    public void duplicate(Component component){
       var componentd = component.clone();
       componentd.render();

    }

}

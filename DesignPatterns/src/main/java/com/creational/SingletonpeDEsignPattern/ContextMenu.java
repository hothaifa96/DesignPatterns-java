package com.creational.SingletonpeDEsignPattern;

public class ContextMenu {

    private static ContextMenu contextMenu;
    private ContextMenu() {
    }

    public void duplicate(Component component){
       var componentd = component.clone();
       componentd.render();

    }

    public static ContextMenu getInstance(){
        if (contextMenu == null)
            contextMenu = new ContextMenu();
        return contextMenu;
    }

}

package com.behavioral.mediatorDewsignPattern;

public class ToDosDialog extends DioalogBox{
    private ListBox toDoListBox = new ListBox(this);
    private Button toDoListbutton = new Button(this);


    @Override
    public void changed(UIControl control) {
        if (control == toDoListbutton){
            toDoListbutton.setEnables(true);
        }
        if (control == toDoListBox)
            toDoListBox.setContent("hello");
    }
}

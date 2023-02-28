package com.behavioral.CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        // GUI
        // Buttons
        // Textbox
        // inputs

        var service = new CustomerService();
        var add = new AddCusomerCommand(service);
        var remove = new RemoveCusomerCommand(service);
        var button = new Button(add);
        var button2 = new Button(remove);

        button.click();
        button2.click();
    }
}

package com.CommandDesignPattern.exercise;

public class Monitor {
    private Command command;

    public Monitor(Command command) {
        this.command = command;
    }

    public void changeSource(){
        command.execute();
    }
}

package com.CommandDesignPattern.exercise;

public class Main {
    public static void main(String[] args) {
        SourcesService service = new SourcesService();
        Command cmd = new SourceCommand(service);
        Monitor m1 = new Monitor(cmd);

        m1.changeSource();
        m1.changeSource();
        m1.changeSource();
        m1.changeSource();
    }
}

package com.memntoDesignPattern;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();
        editor.setContent("hothaifa");
        history.push(editor.createState());

        editor.setContent("hodi");
        history.push(editor.createState());

        editor.setContent("hodi zoubi");
        System.out.println(editor.getContent());

        editor.restore(history.pop());

        System.out.println(editor.getContent());

    }
}

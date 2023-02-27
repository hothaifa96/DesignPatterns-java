package com.memntoDesignPattern.exercise;

public class Main {
    public static void main(String[] args) {
        // build a Document Class to represent a document in a
        // word  processor like ms word or pages
        // our document class has 2 attributes :
        // content String
        // font-size int
        // we should allow the user to undo th changes
        // to any of these attributes
        // implement the memento dp to solve the issue
        var doc = new Document();
        var history = new History();

        doc.setContent("shalom ");
        doc.setForntSize(155);
        history.push(doc.createDocumentState());

        doc.setContent("hello ");
        doc.setForntSize(22);

        System.out.println(doc);

        doc.restore(history.pop());

        System.out.println(doc);


    }
}

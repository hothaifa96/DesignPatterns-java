package com.behavioral.memntoDesignPattern.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<DocumentState> documentStates = new ArrayDeque<>();

    public void push(DocumentState documentState){
        documentStates.push(documentState);
    }

    public DocumentState pop(){
        return documentStates.pop();
    }
}

package com.memnto.exercise;

public class DocumentState {
    private final String content ;
    private final int fontSize ;

    public DocumentState(String content, int fontSize) {
        this.content = content;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }
}

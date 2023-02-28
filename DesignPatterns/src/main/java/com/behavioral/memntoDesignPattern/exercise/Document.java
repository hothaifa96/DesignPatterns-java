package com.behavioral.memntoDesignPattern.exercise;

public class Document {
    private String content;
    private int forntSize;

    public DocumentState createDocumentState() {
        return new DocumentState(content, forntSize);
    }

    public void restore(DocumentState documentState) {
        this.content = documentState.getContent();
        this.forntSize = documentState.getFontSize();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getForntSize() {
        return forntSize;
    }

    public void setForntSize(int forntSize) {
        this.forntSize = forntSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", forntSize=" + forntSize +
                '}';
    }
}

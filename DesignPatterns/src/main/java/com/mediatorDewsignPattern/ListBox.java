package com.mediatorDewsignPattern;

public class ListBox extends UIControl{
    private String content;

    public ListBox(DioalogBox owner) {
        super(owner);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        owner.changed(this);
    }
}

package com.structurlas.AdapterDesignPattern.Exercise;

public class Mail {
    private String sender;
    private String to;
    private String content;

    public Mail(String sender, String to, String content) {
        this.sender = sender;
        this.to = to;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

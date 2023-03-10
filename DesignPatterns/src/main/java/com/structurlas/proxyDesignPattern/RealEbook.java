package com.structurlas.proxyDesignPattern;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    public void load() {
        System.out.println("Loading the eboook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the eboook " + fileName);
    }

    public String getFileName() {
        return fileName;
    }
}

package com.structurlas.proxyDesignPattern;

public class EbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    @Override
    public String getFileName() {
        return fileName;
    }

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);
        ebook.show();
    }
}

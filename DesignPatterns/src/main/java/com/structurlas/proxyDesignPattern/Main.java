package com.structurlas.proxyDesignPattern;

public class Main {
    // client   -> Proxy -> targetma
    public static void main(String[] args) {
        var library = new Library();
        String[] filenames = {"a","b","c","d"};

        for (var name :filenames)
            library.add(new EbookProxy(name));

        library.openEbook("a");
        library.openEbook("a");
    }
}

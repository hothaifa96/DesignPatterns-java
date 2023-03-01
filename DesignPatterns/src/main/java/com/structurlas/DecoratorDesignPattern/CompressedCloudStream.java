package com.structurlas.DecoratorDesignPattern;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        stream.write(data.substring(1, 5));
    }
}

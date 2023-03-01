package com.structurlas.DecoratorDesignPattern;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        data = "@@#!$#%^&$^T#RQWDWE@#±!@#!@";
        stream.write(data);
    }
}

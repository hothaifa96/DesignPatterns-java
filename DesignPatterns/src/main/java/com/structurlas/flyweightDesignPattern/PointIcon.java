package com.structurlas.flyweightDesignPattern;

public class PointIcon {
    private PointType type; // 4 bytes
    private byte[] icon; // 20KB

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}

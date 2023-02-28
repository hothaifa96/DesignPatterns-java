package com.observerDesignPattern;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var sheet14 = new SpreadSheet();
        var sheet24 = new SpreadSheet();
        var sheet34 = new SpreadSheet();
        var char2 = new Chart();
        var char3 = new Chart();

        dataSource.addObserver(sheet14);
        dataSource.addObserver(sheet24);
        dataSource.addObserver(sheet34);
        dataSource.addObserver(char2);
        dataSource.addObserver(char3);

        dataSource.setValue(155);
        dataSource.setValue(152);
        dataSource.notifyObserver();
    }
}

package com.IteratorDesignPattern;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        var x = 6;
//        while (x > 0){
//            System.out.println(--x);
//        }
//        var list = new String[4];
//        list[0]= "python";
//        list[1]= "csharp";
//        list[2]= "java";
//        list[3]= "sql";
//
//        System.out.println(Arrays.toString(list));
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i]);
//        }
//        for (var s: list) {
//            System.out.println(s);
//        }
//
//        while (list.hasNext()){
//            String s = list.current();
//            list.next()
//        }

        var history = new History();
        history.push("www.youtube.com");
        history.push("www.skype.com");
        history.push("www.google.com");
        history.push("www.linkedin.com");
        history.push("www.facebook.com");

        Iterator<String> iterator = history.createIterator();

        while ( iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}

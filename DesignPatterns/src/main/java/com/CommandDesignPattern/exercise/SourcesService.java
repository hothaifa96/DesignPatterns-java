package com.CommandDesignPattern.exercise;

import javax.xml.transform.Source;

public class SourcesService {
    public String source = "TV";
    public void Change(){
        if (source == "TV"){
            source = "HDMI";
        } else if (source =="HDMI") {
            source="TV";
        }
        // we can change it using state design pattern
        System.out.println(source +" on");
    }
}

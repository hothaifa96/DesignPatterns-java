package com.structurlas.proxyDesignPattern.exercise;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class NetService {
    private Map<String,Internet> urls= new HashMap<>();

    public void addSite(String URL){
            urls.put(URL,new Proxy(URL));
    }

    public void connectTo(String url){
        if (urls.containsKey(url))
            urls.get(url).connectTo();
        else {
            System.out.println("not exist adding .......");
            addSite(url);
            urls.get(url).connectTo();
        }
    }
}

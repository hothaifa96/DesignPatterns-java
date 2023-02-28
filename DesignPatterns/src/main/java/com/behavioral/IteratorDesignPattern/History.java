package com.behavioral.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<String> urls = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }
    public String pop(){
        var lastIndex = urls.size()-1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator createIterator(){
        return new ListIterator(this);
    }

    public List<String> getUrls() {
        return urls;
    }

    public class ListIterator implements Iterator<String>{

        private History history;
        private int index;

        public ListIterator(History history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}

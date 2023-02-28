package com.CommandDesignPattern.exercise;

public abstract class Channel {
    private SourcesService service;

    public Channel(SourcesService service) {
        this.service = service;
    }

    public Channel() {
    }

    public void execute(){
        service.Change();
    }
    protected abstract void doExecute();
}

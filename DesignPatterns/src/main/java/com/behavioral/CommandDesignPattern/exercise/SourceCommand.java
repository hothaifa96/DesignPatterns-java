package com.behavioral.CommandDesignPattern.exercise;

public class SourceCommand implements Command{
    private SourcesService service;

    public SourceCommand(SourcesService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.Change();
    }
}

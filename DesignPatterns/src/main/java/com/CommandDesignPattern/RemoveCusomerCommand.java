package com.CommandDesignPattern;

public class RemoveCusomerCommand implements Command {
    private CustomerService service;

    public RemoveCusomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.removeUser();
    }
}

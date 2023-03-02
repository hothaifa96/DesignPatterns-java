package com.structurlas.bridgeDesignPattern;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public  void switchChannel(){
        device.switchChannel();
    }

}

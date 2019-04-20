package com.solo.designpatterns.commanddesignpattern;

public class LightOncommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.turnOn ();
    }

    public LightOncommand(Light light) {
        this.light = light;
    }
}

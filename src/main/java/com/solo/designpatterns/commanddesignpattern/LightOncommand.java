package com.solo.designpatterns.commanddesignpattern;

public class LightOncommand implements Command {

  private Light light;

  public LightOncommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}

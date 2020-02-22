package com.solo.designpatterns.commanddesignpattern;

public class LightOffCommand implements Command {

  private Light light;


  @Override
  public void execute() {
    light.turnOff();
  }

  public LightOffCommand(Light light) {
    this.light = light;
  }
}

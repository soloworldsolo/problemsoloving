package com.solo.designpatterns.commanddesignpattern;

public class Device {

  private Command onButton;
  private Command offButton;

  public Device(Command onButton, Command offButton) {
    this.onButton = onButton;
    this.offButton = offButton;
  }

  public void turnOn() {
    onButton.execute();
  }

  public void turnOff() {
    offButton.execute();
  }
}

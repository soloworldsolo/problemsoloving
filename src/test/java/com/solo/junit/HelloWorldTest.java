package com.solo.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

  HelloWorld helloWorld;
  Thread t = new Thread();

  @BeforeEach
  public void BeforeEach() {
    helloWorld = new HelloWorld();
  }

  @Test
  @Tag("soloworld")
  public void helloWorld() {

  }
}
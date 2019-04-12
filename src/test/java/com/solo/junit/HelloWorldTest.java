package com.solo.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    HelloWorld helloWorld;

    @BeforeEach
   public void BeforeEach() {
        helloWorld = new HelloWorld ();
    }

    @Test
    @Tag ("soloworld")
   public void helloWorld() {
        String expected = helloWorld.hello ();
        assertEquals (expected,"HELLOWORLD");
    }

    Thread t = new Thread ();
}
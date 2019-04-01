package com.solo.alimetrik;

import java.util.Objects;

import static java.util.Objects.*;

public class Alpahbetshifting {

    public String Shiftalphabets(String input) {
        requireNonNull (input);

        char chararray[] = new char[input.length ( )];

        for (int i = 0; i < chararray.length; i++) {
            int a = ((input.toCharArray ( )[i]-97+3+26) %26 + 97);
            System.out.println (a );
            chararray[i] = (char) a;

        }

        return new String (chararray);
    }
}
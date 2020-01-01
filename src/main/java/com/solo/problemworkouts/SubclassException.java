package com.solo.problemworkouts;

import java.io.IOException;
/*
  sub class overriden method acn throw exception only if super class can throw exception
 */
public class SubclassException {
    public  void  process() {
        System.out.println ("It is from Main class" );
    }

    class B extends SubclassException {
        public  void  process() /*throws IOException */{
            super.process ();
            System.out.println ("B has been caleed" );
          //  throw new IOException ();
        }
    }
}


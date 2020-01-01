package com.solo.problemworkouts;

 class ConstructorFromSubclass {
     public ConstructorFromSubclass() {
         System.out.println (" constructor frtom main class");
     }
 }
 class B extends ConstructorFromSubclass {
     public B(String parameter) {
         System.out.println ("class b has been called with value" + parameter );
     }
 }

   class  C extends  B  {
     public C() {
         super ("world");
        new B("world");
     }

       public static void main(String[] args) {
           new C();
       }

 }




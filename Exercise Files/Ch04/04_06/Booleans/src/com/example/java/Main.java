package com.example.java;

public class Main {

    static bDef; //variable is a member of the class

    public static void main(String[] args) {

        //method variables
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("b1 is : " + b1);
        System.out.println("b2 is : " + b2);
        System.out.println("bDef is : " + bDef); //default boolan = false

        boolean b3 = !b1; //"!" is a negation operator and it sets the value to opposite of what its value currently is
        System.out.println("b3 is : " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0); //evaluates expression insid parenthases and b4 gets the resulting value
        // in this case i1 does = 0 so the result of the epxression i1 not = 0 is false becuase it is 0, so b4 gets false
        System.out.println("b4 is : " + b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean); //boolean helper class
        //Boolean.parseBoolean can interpret the string "true" and make it an actual bolean true/false value
        System.out.println("parsed is : " + parsed);

    }

}

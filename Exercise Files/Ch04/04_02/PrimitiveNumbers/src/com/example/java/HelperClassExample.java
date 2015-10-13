package com.example.java;

/**
 * Created by wawatson on 10/2/2015.
 */


/*
Tutorial taken from
http://www.tutorialspoint.com/java/lang/double_intvalue.htm

 */
public class HelperClassExample {

    public static void main(String[] args) {

    /* returns the double value represented by this object
    converted to type int */
        Double obj = new Double("32.90");
        int i = obj.intValue();
        System.out.println("Value = " + i);

        obj = new Double("30.0");
        i = obj.intValue();
        System.out.println("Value = " + i);
    }


}

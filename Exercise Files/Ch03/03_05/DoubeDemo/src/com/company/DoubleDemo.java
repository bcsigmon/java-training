package com.company;

/**
 * Created by wawatson on 10/1/2015.
 */
import java.lang.*;

public class DoubleDemo {

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
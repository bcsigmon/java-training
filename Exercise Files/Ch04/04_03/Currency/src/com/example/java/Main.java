package com.example.java;
//java.lang is always avalable
import java.math.BigDecimal; //added import for BigDecimal

public class Main {

    public static void main(String[] args) {

        double value = .012;

        double pSum = value + value + value; //should be .036

        System.out.println("sum of primitives: " + pSum); // but prints out as .03600000000000004
        //calculation is imprecise with double and floats
        //BigDecimal fixes this problem in Java

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);

        //BigDecimal takes a String value
        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bsum = bigValue.add(bigValue).add(bigValue).add(bigValue); //adds bigValue 3 times

        //System.out.println("Sum of BigDecimals: " + bsum);
        // can't just pass in bsum because println doesn't know how to convert a complex object like BigDecimal to a String
        System.out.println("Sum of BigDecimals: " + bsum.toString());

    }

}

package com.example.java;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("subtraction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("multiply: " + result3);

        //int result4 = intValue1 / intValue2;
        //must change data type of result4 to double and cast the result of the division into (double)
        // since the 2 variables intValue1 and intValue2 are of another data type, int
        double result4 = (double) intValue1 / intValue2;
        System.out.println("divide: " + result4);

        int result5 = intValue1 % intValue2;
        System.out.println("remainder: " + result5);

        double doubleValue = -3.99999;
        long rounded = Math.round(doubleValue);
        System.out.println("rounded: " + rounded);

        double absValue = Math.abs(doubleValue);  //absoulte value
        System.out.println("absValue: " + absValue);

    }

}

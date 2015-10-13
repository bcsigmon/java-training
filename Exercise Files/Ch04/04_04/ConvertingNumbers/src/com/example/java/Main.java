package com.example.java;

public class Main {

    public static void main(String[] args) {

        int intValue1 = 56;
        int intValue2 = intValue1;//makes a copy of value11 into value2
        System.out.println("the 2nd value is :" + intValue2);

        long longValue1 = intValue1; //int is smaller then a long so no problem converting - data is "widended"

        System.out.println("the long value is :" + longValue1);

        short shortValue1 = intValue1; //short is smaller than an int so this will "narrowed" or lose data
        System.out.println("the short value value is :" + shortValue1);

        //to fix this need to case the int as a short
        short shortValue2 = (short) intValue1;
        System.out.println("the short is :" + shortValue2);

        int intValue3 = 1024;
        //byte byteValue = intValue3;
        byte byteValue  = (byte) intValue3;
        System.out.println("the byte value is :" + byteValue); //byte is smaller than an int 1024 so you will lose data

        double doubleValue = 3.999999d;
        int intValue4 = (int) doubleValue;
        System.out.println("double to int value is :" + intValue4); //int is smaller than an double so you will lose the decimals



    }

}

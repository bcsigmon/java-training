package edu.ua.java;

import java.math.BigDecimal;

public class Variables {

    static boolean bDef;

    public static void main(String[] args){

        System.out.println("Hello World");
        System.out.println(args[0]);

        String aString = "Zach";
        System.out.println("Your name is " + aString);

        //////////////////////////////
        //Declaring and initializing numeric primitives
        byte b = 1;
        short sh = 1;
        int i = 1;
        long l = 1L;   //explicitly cast as a long
        float f = 1f;  //explicitly cast as a float
        double d = 1d; //explicitly cast as a double

        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        b = 127;
        System.out.println("Byte: " + b);

        if (b < Byte.MAX_VALUE) {
            b++;
        }

        System.out.println("Byte: " + b);

        //////////////////////////////
        //Representing currency values with BigDecimal
        double value = .012;
        double pSum = value + value + value;

        System.out.println("pSum: " + pSum); //bad sum because double is dumb

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);

        BigDecimal bigValue = new BigDecimal(strValue);
        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("bSum: " + bSum.toString());

        //////////////////////////////
        //Converting numeric values
        int intValue1 = 56;
        int intValue2 = intValue1;
        System.out.println("The int2 value is " + intValue2);

        long longValue1 = intValue1;
        System.out.println("The long value is " + longValue1);

        short shortValue1 = (short) intValue1;
        System.out.println("The short value is " + shortValue1);

        int intValue3 = 1024;
        byte byteValue1 = (byte) intValue3;
        System.out.println("Int to byte: " + byteValue1);

        double doubleValue1 = 3.999999d;
        int intValue4 = (int) doubleValue1;
        System.out.println("Double to int: " + intValue4);

        //////////////////////////////
        //Using mathematical operators and the Math class
        intValue1 = 56;
        intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition: " + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("Subtraction: " + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("Multiplication: " + result3);

        double result4 = (double) intValue1 / (double) intValue2;
        System.out.println("Division: " + result4);

        int result5 = intValue1 % intValue2;
        System.out.println("Remainder: " + result5);

        doubleValue1 = -3.99999;
        long rounded = Math.round(doubleValue1);
        System.out.println("Rounded: " + rounded);

        double absValue = Math.abs(doubleValue1);
        System.out.println("Absolute: " + absValue);

        //////////////////////////////
        //Working with Boolean values and expressions
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);
        System.out.println("The value of bDef is: " + bDef);

        boolean b3 = !b1;
        System.out.println("The value of b3 is: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is: " + b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed: " + parsed);

        //////////////////////////////
        //Working with character values
        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        char dollarSign = '\u0024';
        System.out.println("Currency: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        //////////////////////////////
        //Using Java operators
         //just information

        //////////////////////////////

    }

}

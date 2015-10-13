/**
 * Created by wawatson on 10/2/2015.
 */
package com.example.java;

public class MaxValues {
    
    public static void main(String[] args) {

        byte b = 127; //127 is the ma of a byte

        System.out.println("byte: " + b);

        //b++;
        //System.out.println("byte: " + b);
        //exceeeds max value for its type and will wrap around to its min value

        if (b < Byte.MAX_VALUE) { //Byte is a helper class with a contant MAX_VALUE

            b++;
        }
        System.out.println("byte: " + b);

    }
}

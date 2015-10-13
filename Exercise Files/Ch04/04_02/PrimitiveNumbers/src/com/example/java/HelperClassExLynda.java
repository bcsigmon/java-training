package com.example.java;

/**
 * Created by wawatson on 10/2/2015.
 */
public class HelperClassExLynda {

    public static void main(String[] args) {

        double  myDoubleVar = 156.5d;
        //Double myDoubleVar2 = new Double("32.90");
        //byte myByteVar = Double.byteValue(myDoubleVar);
        //byte myByteVar = myDoubleVar.byteValue();

        //Uses the helper class “Double” which has a method “byteValue” to convert the
        // myDoubleVar variable to a byte which can then be stored into myByteVar which is a byte primitive data type
        //int myIntVar = myDoubleVar.intValue();
        int myIntVar = (int) myDoubleVar;

        //int myIntVar = myDoubleVar.intValue();
        //all objects have toString() method

        //A better example of double to int
        //http://www.tutorialspoint.com/java/lang/double_intvalue.htm

    }

}

package com.example.java;

import java.lang.Character;

public class Main {

    public static void main(String[] args) {

        char c1 = '1'; //character literals are always in single quotes ''
        //string literals are always in double quotes ""
        char c2 = '2';
        char c3 = '3';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        char dollarSign = '\u0024'; //unicode # for "$"
        //same as char dollarSign = '$';
        System.out.println("dollarSign = " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        //can;t set a char to 'a1', bc chars are a single character; for that it would need to be a Strirng "a1"
        char a3 = 'c';

        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

    }

}

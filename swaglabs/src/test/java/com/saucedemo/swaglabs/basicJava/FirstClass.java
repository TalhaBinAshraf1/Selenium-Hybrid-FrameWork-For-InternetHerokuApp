package com.saucedemo.swaglabs.basicJava;


import java.util.*;

public class FirstClass {

        public static void main(String[] args) {

        /*
        //Operator in Java is a symbol which is used to perform
        // operations. For example: +, -, *, / etc.
        Unary Operator,
        Arithmetic Operator, = * / % , + -
        Shift Operator, = << >>  >>>
        Relational Operator, <= >= < > == !=
        Bitwise Operator, = & ^ |
        Logical Operator, = && ||
        Ternary Operator and = ? :
        Assignment Operator. = = += -= /=


        int a = 3;
        int b = 5;
        int c =  15;

        System.out.println(a<b && a<c); //true && true = true
        System.out.println(a<b & a<c); //true & true = true

        System.out.println(a<b || a<c); //true && true = true
        System.out.println(a<b | a<c); //true & true = true */

                //Creating Array
                String[] array={"Java","Python","PHP","C++"};
                System.out.println("Printing Array: "+ Arrays.toString(array));
                List<String> list=new ArrayList<String>();
                for(String lang:array){
                        list.add(lang);
                }
                System.out.println("Printing List: "+list);



        }
}

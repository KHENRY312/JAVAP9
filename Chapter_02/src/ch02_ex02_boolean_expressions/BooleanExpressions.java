/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex02_boolean_expressions;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex02_boolean_expressions
 * Class:              BooleanExpressions
 * Programmer:   Kimberly Henry
 * Date:               Mon, 14-Jun-2021
 */
public class BooleanExpressions
   {
      public static void main(String[] arg)
         {
            int a = 15;
            int b = 13;
            boolean c = a < b;
            System.out.println("a. The boolean value of " + a + " < " + b + " is " + c + ".");
            a = 8;
            b = 5;
            int d = 2;
            int e = 6;
            boolean f = a <= b * (d +e);
            System.out.println("b. The boolean value of " + a + " <= " + b + " * ( " + d + " + " +  e + " )" + " is " + f + ".");
            a = 15;
            boolean g = a == a;
            System.out.println("c. The boolean value of " + a + "  == " + a + " is " + g + ".");
            a = 3;
            boolean h = a >= a;
            System.out.println("d. The boolean value of " + a + "  >=  " + a + " is " + h + ".");
            a = 4;
            b = 2;
            boolean i = a * b == b * a;
            System.out.println("e. The boolean value of " + a + " * " + b + " == " + b + " * " + a + " is " + i + ".");
            a = 5;
            b = 8;
            d = 3;
            boolean j = a < b - d;
            System.out.println("f. The boolean value of " + a + " < "  + b + " - " + d + " is " + j +".");
            a = 7;
            boolean k = a != a;
            System.out.println("g. The boolean value of " + a + " != "  + a + "  is " + k + ".");
            a = 8;
            b = 2;
            d = 5;
            boolean l = a != (b + d);
            System.out.println("h. The boolean value of " + a + " != ( " + b + " +"  + d + " ) is " + l + " .");
            a = 10;
            b = 20;
            d = -10;
            boolean m = a - b == -a;
            System.out.println("i. The boolean value of " + a + " - " +  b + "  == " + d + "  is " + m + ".");
            a = 3;
            b = 2;
            d = 6;
            e = 30;
            boolean o = a + b * d == e;
            System.out.println("j. The boolean value of " + a + " + " +  b +  " * " + d + "  == " + e + " is " + o + ".");
         }
   }
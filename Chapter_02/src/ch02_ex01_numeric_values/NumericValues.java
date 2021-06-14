/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex01_numeric_values;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex01_numeric_values
 * Class:              NumericValues
 * Programmer:   Kimberly Henry
 * Date:               Mon, 14-Jun-2021
 */
public class NumericValues
   {
      public static void main(String[] arg)
         {
            int a, b, c,  d;
            a = 4;
            b = 6;
            c = 2;
            d = a + b * c;
            System.out.println("a. the value of " + a + " + " + b + " * " + c + " = " + d);
            a = 10;
            b = 5;
            c = 8;
            d = a / b + c;
            System.out.println("b. the value of " + a + " / " + b + " + " + c + " = " + d);
            a = 12;
            b = 4;
            c = 16;
            d = 2;
            int e = a / b + c  / d;
            System.out.println("c. the value of " + a + " / " + b + " + " + c + " / " +  d + "  = " + e);
            a = 17;
            b = 2;
            c = a / b;
            System.out.println("d. The value of " + a + " / " +  b + " = " + c);
            a = 22;
            b = 5;
            c = a / b;
            System.out.println("e. The value of " + a + " / " +  b + " = " + c);
            a = 39;
            b = 10;
            c = a / b;
            System.out.println("f. The value of " + a + " / " +  b + " = " + c);
            a = 19;
            b = 2;
            c = 3;
            d = a % (b + c);
            System.out.println("g. the value of " + a + " % (" + b + " + " + c + ") = " + d);
            a = 3;
            b = 4;
            c = 20;
            d = a + b * c  / a;
            System.out.println("h. the value of " + a + " + " + b + " * " + c + " / " +  a + "  = " + d);
            a = 36;
            b = 6;
            c = 2;
            d = a % (b + c);
            System.out.println("i. the value of " + a + " % (" + b + " + " + c + ") = " + d);
            a = 8;
            b = 2;
            c = 0;
            d = (a % b) + c;
            System.out.println("j. the value of " + a + " % " + b + " + " + c + " = " + d);
         }
   }

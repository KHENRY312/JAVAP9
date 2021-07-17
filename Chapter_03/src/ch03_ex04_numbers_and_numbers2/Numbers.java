/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex04_numbers_and_numbers2;
/**
 * Project:            JP9
 * Module:           Chapter_03
 * Package:          ch03_ex04_numbers_and_numbers2
 * Class:              Numbers
 * Programmer:   Kimberly Henry
 * Date:               Thu, 15-Jul-2021
 */
public class Numbers
   {
      public static void main(String[] arg)
         {
            int a, b;
            a = 5;
            b = 7;
            System.out.println();
            displayTwiceTheNumber(a, b);
            displayNumberPlusFive(a, b);
            displayNumberSquared(a, b);
         }
      public static void displayTwiceTheNumber(int c, int d)
         {
            final int TWO = 2;
            int e = TWO * c;
            int f = TWO * d;
            System.out.println();
            System.out.println("Twice The Number");
            System.out.println("Twice the number of " + c + " is " + e + ".");
            System.out.println("Twice the number of " + d + " is " + f + ".");
         }
      public static void displayNumberPlusFive(int g, int h)
         {
            final int FIVE = 5;
            int i = FIVE + g;
            int j = FIVE + h;
            System.out.println();
            System.out.println("Number Plus Five");
            System.out.println("Five plus the number of  " + g + " is " + i + ".");
            System.out.println("Five plus the number of  " + h + " is " + j + ".");
         }
      public static void displayNumberSquared(int k, int l)
         {
            double m = Math.sqrt(k);
            double n = Math.sqrt(l);
            System.out.println();
            System.out.println("Number Squared");
            System.out.println("The square root of  " + k + " is " + m + ".");
            System.out.println("The square root of  " + l + " is " + n + ".");
         }
   }

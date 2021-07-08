/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_db03_debug_two3;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_db03_debug_two3
 * Class:              FixDebugTwo3
 * Programmer:   Kimberly Henry
 * Date:               Thu, 08-Jul-2021
 */
public class FixDebugTwo3
   {
      public static void main(String[] arg)
         {
            int a = 99, b = 8, result;
            long c = 7777777777777L;
            result = a % b;
            System.out.println("Divide " + a + " by " + b);
            System.out.println("remainder is " + result);
            System.out.print("c is a very large number: ");
            System.out.println(c);
         }
   }

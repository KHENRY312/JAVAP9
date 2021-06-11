/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ydi02_integer_demo;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ydi02_integer_demo
 * Class:              ch02_ydi02_integer_demo
 * Programmer:   Kimberly Henry
 * Date:               Fri, 11-Jun-2021
 */
public class ch02_ydi02_integer_demo
   {
      public static void main(String[] arg)
         {
            int anInt = 1234;
            byte aByte = 12;
            short aShort = 1234;
            long aLong = 1234567890987654321L;
            int anotherInt = anInt * 10000000;
            System.out.println("The int is " + anInt);
            System.out.println("The byte is " + aByte);
            System.out.println("The short is " + aShort);
            System.out.println("The long is " + aLong);
            System.out.println("Another int is " + anotherInt);
         }
   }

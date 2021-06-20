/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex08_inches_to_feet;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex08_inches_to_feet
 * Class:              InchesToFeet
 * Programmer:   Kimberly Henry
 * Date:               Sat, 19-Jun-2021
 */
public class InchesToFeet
   {
      public static void main(String[] arg)
         {
            final int INCHES = 12;
            int lengthInches = 25;
            System.out.println("The value of " + lengthInches + " inches is " +
                               (lengthInches / INCHES) + " feet and " +
                               "" + (lengthInches % INCHES) + " inches.");
         }
   }

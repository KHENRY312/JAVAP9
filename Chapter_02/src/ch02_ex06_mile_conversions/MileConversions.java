/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex06_mile_conversions;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex06_mile_conversions
 * Class:              MileConversions
 * Programmer:   Kimberly Henry
 * Date:               Sat, 19-Jun-2021
 */
public class MileConversions
   {
      public static void main(String[] arg)
         {
            final int INCHES_MILE = 63_360;
            final int FOOT_MILE = 5_280;
            final int YARDS_MILE = 1_760;
            int miles = 3;
            System.out.println(miles + " converts to " + (INCHES_MILE * miles) + " inches, or " +
                               (FOOT_MILE * miles) + " feet, or " + (YARDS_MILE * miles) + " yards.");
         }
   }

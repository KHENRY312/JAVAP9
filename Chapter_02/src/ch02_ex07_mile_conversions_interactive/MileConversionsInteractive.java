/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex07_mile_conversions_interactive;
import java.util.Scanner;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex07_mile_conversions_interactive
 * Class:              MileConversionsInteractive
 * Programmer:   Kimberly Henry
 * Date:               Sat, 19-Jun-2021
 */
public class MileConversionsInteractive
   {
      public static void main(String[] arg)
         {
            final int INCHES_MILE = 63_360;
            final int FOOT_MILE = 5_280;
            final int YARDS_MILE = 1_760;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the number of miles traveled: ");
            int milesTraveled = keyboard.nextInt();
            System.out.println(milesTraveled + " miles traveled converts to " + (INCHES_MILE * milesTraveled) +
                               " inches, or " + (FOOT_MILE * milesTraveled) + " feet, or " + (YARDS_MILE * milesTraveled)
                               + " yards.");
         }
   }

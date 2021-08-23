/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex05_percentages_and_percentages2;
import java.util.Scanner;
/**
 * Project:            JAVAP9
 * Module:           Chapter_03
 * Package:          ch03_ex05_percentages_and_percentages2
 * Class:              Percentages2
 * Programmer:   Kimberly Henry
 * Date:               Wed, 21-Jul-2021
 */
public class Percentages2
   {
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            double a;
            double b;
            System.out.print("Please enter a double:  ");
             a = keyboard.nextDouble();
             System.out.print("Please enter another double: ");
             b = keyboard.nextDouble();
            System.out.println();
            computePercent(a, b);
            computePercent(b, a);
         }
      public static void computePercent(double a, double b)
         {
            double c = Math.round(a / b * 100);
            System.out.println(a + " is " + c + " % of " + b + ".");
            System.out.println();
         }
   }

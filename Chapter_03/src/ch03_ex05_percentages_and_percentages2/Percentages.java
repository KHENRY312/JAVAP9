/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex05_percentages_and_percentages2;
/**
 * Project:            JAVAP9
 * Module:           Chapter_03
 * Package:          ch03_ex05_percentages_and_percentages2
 * Class:              Percentages
 * Programmer:   Kimberly Henry
 * Date:               Wed, 21-Jul-2021
 * a. Create an application named Percentages whose main() method holds  two double variables. Assign values
 * to the variables. Pass both variables to a method named computePercent() that displays the two values and the
 * value of the first number as a percentage of the second one. For example, if the numbers are 2.0 and 5.0, the
 * method should display a statement similar to 2.0 is 40 percent of 5.0.Then call the method a second time,
 * passing the values in reverse order. Save the application as Percentages.java. b. Modify the Percentages class
 * to accept the values of the two doubles from a user at the keyboard. Save the file as Percentages2.java.
 */
public class Percentages
   {
      public static void main(String[] args)
         {
            double a = 7.0;
            double b = 15.0;
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

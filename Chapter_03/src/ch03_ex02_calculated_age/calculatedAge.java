/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex02_calculated_age;
/**
 * Project:            JP9
 * Module:           Chapter_03
 * Package:          ch03_ex02_calculated_age
 * Class:              calculated
 * Programmer:   Kimberly Henry
 * Date:               Thu, 15-Jul-2021
 */
public class calculatedAge
   {
      public static void main(String[] args)
         {
            int age = 34;
            int weight = 180;
            double height = 5.9;
            System.out.println("Weight:  " + weight);
            System.out.println("Height:  " + height);
            System.out.println("Age:  " + age);
            System.out.println("A.  calculate(age, weight) is a valid method call");
            System.out.println("B  calculate(age, height) is a valid method call");
            System.out.println("C.  calculate(weight, height) is a valid method call");
            System.out.println("D.  calculate(height, age) is not a valid method call, height is a double and therefore " +
                               "should be in the second position.");
            System.out.println("E.  calculate(45.5, 120) is not a valid method call, 4.5  is a double and therefore " +
                               "should be in the second position.");
            System.out.println("F.  calculate(12, 120.2);is a valid method call");
            System.out.println("G.  calculate(age, size) is not a valid method call, size is not defined in the main class.");
            System.out.println("H.  calculate(2, 3) is a valid method call");
            System.out.println("I.  calculate(age) is not a valid method call; only one parameter is used in the method call.");
            System.out.println("J.  calculate(weight, weight);is a valid method call");
         }
      public static void calculate(int age, double size)
         {
            System.out.println("int weight = 180");
            System.out.println("double height = 5.9");
            System.out.print("Age:  " + age);
            System.out.println("Size:  " + size);
         }
   }

/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ydi07_arithmetic_demo2;
import java.util.Scanner;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ydi07_arithmetic_demo2
 * Class:              ArithmeticDemo2
 * Programmer:   Kimberly Henry
 * Date:               Sat, 12-Jun-2021
 */
public class ArithmeticDemo2
   {
      public static void main(String[] arg)
         {
            Scanner keyboard = new Scanner(System.in);
            double firstNumber;
            double secondNumber;
            double sum;
            double difference;
            double average;
            System.out.print("Please enter a double > > ");
            firstNumber = keyboard.nextDouble();
            System.out.print("Please enter another double > > ");
            secondNumber = keyboard.nextDouble();
            sum = firstNumber + secondNumber;
            difference = firstNumber - secondNumber;
            average = sum / 2;
            System.out.println("The sum of " + firstNumber + " and " + 
                  secondNumber + " is " + sum + ".");
            System.out.println("The difference of " + firstNumber + " minus " + 
                  secondNumber + " is " + difference + ".");
            System.out.println("The average of " + firstNumber + " and " +  
                  secondNumber + " is " + average + ".");
         }
   }

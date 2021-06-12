/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ydi06_arithmetic_demo;
import java.util.Scanner;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ydi06_arithmetic_demo
 * Class:              ArithmeticDemo
 * Programmer:   Kimberly Henry
 * Date:               Sat, 12-Jun-2021
 */
public class ArithmeticDemo
   {
      public static void main(String[] arg)
         {
            Scanner keyboard = new Scanner(System.in);
            int firstNumber;
            int secondNumber;
            int sum;
            int difference;
            int average;
            System.out.print("Please enter an integer > > ");
            firstNumber = keyboard.nextInt();
            System.out.print("Please enter another integer > > ");
            secondNumber = keyboard.nextInt();
            sum = firstNumber + secondNumber;
            difference = firstNumber - secondNumber;
            average = sum / 2;
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum + ".");
            System.out.println("The difference of " + firstNumber + " minus " + secondNumber + " is " + difference + ".");
            System.out.println("The average of " + firstNumber + " and " +  secondNumber + " is " + average + ".");
         }
   }

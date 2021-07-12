/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ydi01_paradise_info_info2_and_test_info;
import java.util.Scanner;
/**
 * Project:            JP9
 * Module:           Chapter_03
 * Package:          ch03_ydi01_paradise_info_info2_and_test_info
 * Class:              ParadiseInfo2
 * Programmer:   Kimberly Henry
 * Date:               Mon, 12-Jul-2021
 */
public class ParadiseInfo2
   {
      public static void main(String[] arg)
         {
            double price;
            double discount;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the cutoff price for the discount > > ");
            price = keyboard.nextDouble();
            System.out.print("Enter the discount rate as a whole number > >");
            discount = keyboard.nextDouble();
            double savings = computeDiscountInfo(price, discount);
            displayInfo();
            System.out.println("Special this week on any service over " + price + " dollars.");
            System.out.println("discount of " + discount + " percent.");
            System.out.println("That's a savings of at least $" + savings + ".");
         }
      public static void displayInfo()
         {
            System.out.println("Paradise Day Spa wants to pamper you.");
            System.out.println("We will make you look good.");
         }
      public static double computeDiscountInfo(double price, double discountRate)
         {
            double savings;
            savings = price * discountRate / 100;
            return savings;
         }
   }

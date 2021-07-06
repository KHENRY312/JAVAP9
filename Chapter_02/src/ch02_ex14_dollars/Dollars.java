/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex14_dollars;
import java.util.Scanner;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex14_dollars
 * Class:              Dollars
 * Programmer:   Kimberly Henry
 * Date:               Tue, 06-Jul-2021
 */
public class Dollars
   {
      public static void main(String[] arg)
         {
               Scanner keyboard = new Scanner (System.in);
               final double TWENTY = 20.00;
               final double TEN = 10.00;
               final double FIVE = 5.00;
               final double ONE = 1.00;
      
               int twenties, tens, fives, ones;
               System.out.print("Enter Dollar Amount:  ");
               double money = keyboard.nextDouble();
               keyboard.nextLine();
               twenties = (int) (money / TWENTY);
               double money1 =  money - (twenties * TWENTY);
               tens = (int)(money1 / TEN);
               double money2 = money1 - (tens * TEN);
               fives = (int)(money2 / FIVE);
               double money3  =  money2 - (fives * FIVE);
               ones = (int)(money3 / ONE);
      
               System.out.println(money + " has " + twenties +
                                  " twenties, " + tens + " tens, " + fives +
                                  " fives and "  + ones + " ones.");
         }
   }

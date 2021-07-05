/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex12_chili_to_go;
import java.util.Scanner;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex12_chili_to_go
 * Class:              ChiliToGo
 * Programmer:   Kimberly Henry
 * Date:               Mon, 05-Jul-2021
 */
public class ChiliToGo
   {
      public static void main(String[] arg)
         {
            Scanner keyboard = new Scanner(System.in);
            final double ADULT_MEAL = 7.00;
            final double CHILD_MEAL = 4.00;
            System.out.print("How many adult meals would you like?");
            int mealsAdult = keyboard.nextInt();
            System.out.print("How many children means would you like?");
            int mealsChild = keyboard.nextInt();
            double adults = mealsAdult * ADULT_MEAL;
            double childs = mealsChild * CHILD_MEAL;
            double meals = adults + childs;
            System.out.println("The cost for the adults meals are " + adults + " dollars.");
            System.out.println("The cost for the childs meals are " + childs + " dollars.");
            System.out.println("The total cost of your order is " + meals + " dollars.");
         }
   }

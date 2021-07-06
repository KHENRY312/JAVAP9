/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex13_chili_to_go_profit;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex13_chili_to_go_profit2
 * Class:              ChiliToGoProfit
 * Programmer:   Kimberly Henry
 * Date:               Mon, 05-Jul-2021
 */
public class ChiliToGoProfit
   {
      public static void main(String[] arg)
         {
            final double ADULT_MEAL = 7.00;
            final double ADULT_PROFIT = 4.35;
            final double CHILD_MEAL = 4.00;
            final double CHILD_PROFIT = 3.10;
            int mealsAdult = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "How many adult meals would you like?",
                  "ADULT MEALS", JOptionPane.QUESTION_MESSAGE));
            int mealsChild = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "How many children means would you like?",
                  "CHILDREN MEALS", JOptionPane.QUESTION_MESSAGE));
            double adults = mealsAdult * ADULT_MEAL;
            double adultProfit = mealsAdult * ADULT_PROFIT;
            double childs = mealsChild * CHILD_MEAL;
            double childProfit = mealsChild * CHILD_PROFIT;
            double meals = adults + childs;
            double profit = adultProfit + childProfit;
            JOptionPane.showMessageDialog(null, "The cost for the adults meals are " + adults + " dollars." +
                                                "\nThe cost for the childs meals are " + childs + " dollars." +
                                                "\nThe total cost of your order is " + meals + " dollars." +
                                                "\nThe profit for the adult meals  are " + adultProfit + " dollars." +
                                                "\nThe profit for the children meals are " + childProfit + " dollars." +
                                                "\nThe total profit is " + profit + " dollars.", "CHILI TO GO PROFIT",
                  JOptionPane.INFORMATION_MESSAGE);
         }
   }

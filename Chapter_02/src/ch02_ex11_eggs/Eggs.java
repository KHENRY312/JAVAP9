/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex11_eggs;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex11_eggs
 * Class:              Eggs
 * Programmer:   Kimberly Henry
 * Date:               Fri, 02-Jul-2021
 */
public class Eggs
   {
      public static void main(String[] arg)
         {
            final double DOZEN_EGGS = 3.25;
            final double SINGLE_EGG = .45;
            int order = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "How many eggs would you like to order?: ",
                  "EGG ORDER",
                  JOptionPane.QUESTION_MESSAGE));
            int dozens = (int) (order / DOZEN_EGGS);
            int single = (int) (order % DOZEN_EGGS);
            double costDozen = dozens * DOZEN_EGGS;
            double costSingle = single * SINGLE_EGG;
            JOptionPane.showMessageDialog(null, "You ordered " + order + " eggs." +
            "\n" + order + " eggs are " + dozens + " dozens and " +
            "\n" + single + " single eggs remaining. The cost for " +
            "\n" + dozens + "  dozen eggs is " + costDozen + " dollars.  The cost for " +
            "\n" + single + "  single eggs is " + costSingle + " The total cost of " +
            "\n" + order + " eggs are " + (costDozen + costSingle) + " dollars.",
                  "EGG ORDER", JOptionPane.INFORMATION_MESSAGE);
         }
   }

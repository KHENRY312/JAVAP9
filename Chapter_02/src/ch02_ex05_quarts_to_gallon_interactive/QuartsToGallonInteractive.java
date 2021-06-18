/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex05_quarts_to_gallon_interactive;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex05_quarts_to_gallon_interactive
 * Class:              QuartsToGallonInteractive
 * Programmer:   Kimberly Henry
 * Date:               Fri, 18-Jun-2021
 */
public class QuartsToGallonInteractive
   {
      public static void main(String[] arg)
         {
            final int QUARTS_GALLON = 4;
            int quartsPaintNeeded = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quarts required:  ",
                  "QUARTS PAINT NEEDED", JOptionPane.QUESTION_MESSAGE));
            int gallons = quartsPaintNeeded / QUARTS_GALLON;
            int quartsLeft = quartsPaintNeeded % QUARTS_GALLON;
            JOptionPane.showMessageDialog(null, "To complete the paint job you will need " +
                                                "\n" + gallons + " gallons and " + quartsLeft + " quart(s) of paint.",
                  "PAINT REQUIRED", JOptionPane.INFORMATION_MESSAGE);
         }
   }

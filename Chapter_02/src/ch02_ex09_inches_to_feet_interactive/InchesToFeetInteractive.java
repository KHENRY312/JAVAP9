/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex09_inches_to_feet_interactive;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex09_inches_to_feet_interactive
 * Class:              InchesToFeetInteractive
 * Programmer:   Kimberly Henry
 * Date:               Sun, 20-Jun-2021
 */
public class InchesToFeetInteractive
   {
      public static void main(String[] arg)
         {
            final int INCHES = 12;
            int lengthInches = Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Enter the value of inches ", "INCHES VALUE",JOptionPane.QUESTION_MESSAGE));
            JOptionPane.showMessageDialog(null, "The value of " + lengthInches + " inches is " +
                               (lengthInches / INCHES) + " feet and " +
                               "" + (lengthInches % INCHES) + " inches.",
                  "INCHES TO FEET", JOptionPane.INFORMATION_MESSAGE);
         }
   }

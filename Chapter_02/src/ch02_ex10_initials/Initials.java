/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex10_initials;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex10_initials
 * Class:              Initials
 * Programmer:   Kimberly Henry
 * Date:               Sun, 20-Jun-2021
 */
public class Initials
   {
      public static void main(String[] arg)
         {
            final char FIRST = 'K';
            final char LAST = 'H';
            final char PERIOD = '.';
            JOptionPane.showMessageDialog(null, "" +
                  FIRST + PERIOD + " " + LAST + PERIOD, "INITIALS",
                  JOptionPane.INFORMATION_MESSAGE);
         }
   }

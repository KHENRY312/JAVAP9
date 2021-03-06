/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex15_minutes_conversion;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex15_minutes_conversion
 * Class:              MinuteConversion
 * Programmer:   Kimberly Henry
 * Date:               Tue, 06-Jul-2021
 */
public class MinuteConversion
   {
      public static void main(String[] arg)
         {
            final int MINUTES_IN_HOUR = 60;
            final int HOURS_IN_DAY = 24;
            int minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Minutes:  ",
                  "MINUTES ENTRY", JOptionPane.QUESTION_MESSAGE));
   
            int calcMinutes = minutes % MINUTES_IN_HOUR;
            int calcDays =  ((minutes - calcMinutes) /MINUTES_IN_HOUR) / HOURS_IN_DAY;
            int calcHours =  ((minutes - calcMinutes) /MINUTES_IN_HOUR) % HOURS_IN_DAY;
   
            JOptionPane.showMessageDialog(null, "There are " + calcDays + " days " + calcHours +
                                                " hours and " + calcMinutes + " remaining minute(s) in " + minutes + " minutes.",
                  "MINUTES CONVERSION", JOptionPane.INFORMATION_MESSAGE);
         }
   }

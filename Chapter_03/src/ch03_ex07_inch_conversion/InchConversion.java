/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex07_inch_conversion;
import javax.swing.*;
/**
 * Project:            JAVAP9
 * Module:           Chapter_03
 * Package:          ch03_ex07_inch_conversion
 * Class:              InchConversion
 * Programmer:   Kimberly Henry
 * Date:               Sun, 03-Oct-2021
 * There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion. Its main() method
 * accepts a value in inches from a user at the keyboard, and in turn, passes the entered value to two methods.
 * One converts the value from inches to feet, and the other converts the same value from inches to yards. Each
 * method displays the results with an appropriate explanation. Save the application as InchConversion.java.
 */
public class InchConversion
   {
      public static void main(String[] arg)
         {
            int value =  Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a value in inches",
                  "ENTER INCHES", JOptionPane.QUESTION_MESSAGE));
            changeFeet(value);
            changeYard(value);
         }
      public static void changeFeet(int v)
         {
            final int FOOT = 12;
            int feet = v / FOOT;
            JOptionPane.showMessageDialog(null,  "The value of  " + v + " inches is " + feet + " feet.",
                  "CONVERTED VALUE", JOptionPane.INFORMATION_MESSAGE);
         }
      public static void changeYard(int v)
         {
            final int YARD = 3;
            final int FOOT = 12;
            int feet = v / FOOT;
            int  yard = feet / YARD;
            JOptionPane.showMessageDialog(null,"The value of " + v + "  inches is " + yard + " yards." ,
                  "INCHES IN FEET", JOptionPane.INFORMATION_MESSAGE);
         }
   }

/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex06_bookstore_credit;
import javax.swing.*;
/**
 * Project:            JAVAP9
 * Module:           Chapter_03
 * Package:          ch03_ex06_bookstore_credit
 * Class:              BookstoreCredit
 * Programmer:   Kimberly Henry
 * Date:               Wed, 15-Sep-2021
 * To encourage good grades, Hermosa High School has decided to award each  student a bookstore credit that
 * is 10 times the student’s grade point average. In other words, a student with a 3.2 grade point average receives
 * a $32 credit. Create  a class that prompts a student for a name and grade point average, and then passes the
 * values to a method that displays a descriptive message. The message uses the student’s name, echoes the grade;
 * point average, and computes and displays the credit. Save the application as BookstoreCredit.java.
 */
public class BookstoreCredit
   {
      public static void main(String[] arg)
         {
            final int INCREASE = 10;
            String name =  JOptionPane.showInputDialog(null, "Please enter your name",
                  "NAME ENTRY", JOptionPane.QUESTION_MESSAGE );
            double gpa = Double.parseDouble(JOptionPane.showInputDialog(null, "What  is your current GPA",
                  "GRADE POINT AVERAGE", JOptionPane.QUESTION_MESSAGE));
            double creditEarned = INCREASE * gpa;
            JOptionPane.showMessageDialog(null, "Congratulations " + name + "." +
                                               " \n"+"You have earned " + creditEarned + " dollars " +
                                                "\n" + "in book store credit.", "BOOKSTORE CREDIT",
                  JOptionPane.INFORMATION_MESSAGE);
         }
   }

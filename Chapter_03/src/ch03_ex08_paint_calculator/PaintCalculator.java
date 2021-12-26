/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex08_paint_calculator;
import java.util.Scanner;
/**
 * Project:            JAVAP9
 * Module:           Chapter_03
 * Package:          ch03_ex08_paint_calculator
 * Class:              PaintCalculator
 * Programmer:   Kimberly Henry
 * Date:               Mon, 04-Oct-2021
 * Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main()
 * method that prompts the user for the length, width, and height of a rectangular room. Pass these three values
 * to a method that does the following:
 *
 *A Calculates the wall area for a room
 *
 *B Passes the calculated wall area to another method that calculates and returns the number of gallons of paint
 *  needed
 *
 * C Displays the number of gallons needed
 *
 * D Computes the price based on a painting price of $32 per gallon, assuming that the painter can buy any fraction
 * of a gallon of paint at the same price as a whole gallon
 *
 * E Returns the price to the main() method
 *
 * The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room with 10-foot
 * ceilings is $64. Save the application as PaintCalculator.java.
 */
class PaintCalculator
   {
      final static int WALL_AREA = 350;
      final static double PAINT = 32.00;
      static double length;
      static double width;
      static double height;
      public static void main(String[] args)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter the length of the room:  ");
            length = keyboard.nextDouble();
            System.out.print("Enter the width of the room:  ");
            width = keyboard.nextDouble();
            System.out.print("Enter the height of the room:  ");
            height = keyboard.nextDouble();
            calculatePaintRequired();
         }
      public static double calculateRoomArea(double l, double w, double h)
         {
            final int WALLS = 2;
            double totalLength = l * WALLS;
            double totalWidth = w * WALLS;
            return (totalLength + totalWidth) * h;
         }
      public static void calculatePaintRequired()
         {
            int gallonsRequired = (int) calculateRoomArea(length, width, height) / WALL_AREA;
            double paintCost = gallonsRequired * PAINT;
            System.out.println("For a room of " + calculateRoomArea(length, width, height) + " square feet, it will " +
                               "take " + gallonsRequired + " gallons of paint. " +
                               "\nAt a cost of " + PAINT + " per gallon, it will cost " + paintCost + " dollars.");
         
         }
   }

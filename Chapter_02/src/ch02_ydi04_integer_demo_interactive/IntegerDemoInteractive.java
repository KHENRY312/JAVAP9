/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ydi04_integer_demo_interactive;
import java.util.Scanner;
public class IntegerDemoInteractive
   {
      public static void main(String[] arg)
         {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter an integer --->  ");
            int anInt = keyboard.nextInt();
            System.out.print("Please enter a byte --->  ");
            byte aByte = keyboard.nextByte();
            System.out.print("Please enter a short --->  ");
            short aShort = keyboard.nextShort();
            System.out.print("Please enter a long --->  ");
            long aLong = keyboard.nextLong();
            System.out.print("Please enter another integer ---> ");
            int anotherInt = keyboard.nextInt();
            anotherInt = anInt * 10000000;
            keyboard.nextLine();
            System.out.print("Please enter your name ---> ");
            String name = keyboard.next();
            System.out.println("The int is " + anInt);
            System.out.println("The byte is " + aByte);
            System.out.println("The short is " + aShort);
            System.out.println("The long is " + aLong);
            System.out.println("Another int is " + anotherInt);
            System.out.println("Thank you, " + name);
         }
   }

/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ex01_legal_method_calls;
/**
 * Project:            JP9
 * Module:           Chapter_03
 * Package:          ch03_ex01_legal_method_calls
 * Class:              LegalMethodCalls
 * Programmer:   Kimberly Henry
 * Date:               Mon, 12-Jul-2021
 */
public class LegalMethodCalls
   {
      public static void main(String[] arg)
         {
            int x = 2;
            int y = 3;
            mathMethod(x);
            System.out.println(y);
            System.out.println("mathMethod(x); is legal");
            System.out.println("mathMethod(y); is legal");
            System.out.println("mathMethod(x, y); is not legal");
            System.out.println("mathMethod(x + y); is legal");
            System.out.println("mathMethod(12L); is not legal");
            System.out.println("mathMethod(12); is legal");
            System.out.println("mathMethod(12.2);  is not legal");
            System.out.println("mathMethod();  is not legal");
            System.out.println("mathMethod(a);  is not legal");
            System.out.println("mathMethod(a / x); is not legal");
         }
      public static void mathMethod(int x)
         {
            System.out.println(x);
         }
   }

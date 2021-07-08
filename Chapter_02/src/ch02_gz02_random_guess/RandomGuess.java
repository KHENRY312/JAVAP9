/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_gz02_random_guess;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_gz02_random_guess
 * Class:              RandomGuess
 * Programmer:   Kimberly Henry
 * Date:               Thu, 08-Jul-2021
 */
public class RandomGuess
   {
      public static void main(String[] arg)
         {
             String guessString;
             int random;
             int guess;
             final int MIN = 1;
             final int MAX = 5;
             boolean isMatch;
             random = MIN + (int)(Math.random() * MAX);
             guessString = JOptionPane.showInputDialog(null,
                   "Guess my number between " + MIN + " and " + MAX,
                   "Random guess", JOptionPane.INFORMATION_MESSAGE);
             guess = Integer.parseInt(guessString);
             isMatch = guess == random;
             JOptionPane.showMessageDialog(null,"Your guess was " + (random - guess) +
                                                " numbers away from the random number.",
                   "Player Guess", JOptionPane.INFORMATION_MESSAGE);
             JOptionPane.showMessageDialog(null, "The number was " + random +
                                                 ". The result is " + isMatch + ".", "Winning Number",
                   JOptionPane.INFORMATION_MESSAGE);
         }
   }

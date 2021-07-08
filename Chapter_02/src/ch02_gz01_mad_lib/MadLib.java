/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_gz01_mad_lib;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_gz01_mad_lib
 * Class:              MadLib
 * Programmer:   Kimberly Henry
 * Date:               Thu, 08-Jul-2021
 */
public class MadLib
   {
      public static void main(String[] arg)
         {
            String noun1, noun2, adjective, pastVerb;
            noun1 = JOptionPane.showInputDialog("Enter a noun");
            noun2 = JOptionPane.showInputDialog("Enter another noun");
            adjective = JOptionPane.showInputDialog("Enter an adjective");
            pastVerb = JOptionPane.showInputDialog("Enter a past tense verb");
            JOptionPane.showMessageDialog(null,"Mary had a little " + noun1 +
                                               "\nIts " + noun2 + " was " + adjective + " as snow" +
                                               "\nAnd everywhere that Mary " + pastVerb +
                                               "\nThe " + noun1 + " was sure to go");
         }
   }

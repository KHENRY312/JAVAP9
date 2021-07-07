/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch02_ex16_election_statistics;
import javax.swing.*;
/**
 * Project:            JP9
 * Module:           Chapter_02
 * Package:          ch02_ex16_election_statistics
 * Class:              ElectionStatistics
 * Programmer:   Kimberly Henry
 * Date:               Wed, 07-Jul-2021
 */
public class ElectionStatistics
   {
      public static void main(String[] arg)
         {
            int obama = 570;
            int bush =  285;
            int trump = 143;
            int totalVotes = obama + trump + bush;
            double percentObama = ((double) obama / totalVotes);
            double percentTrump =  (double) trump / totalVotes;
            double percentBush = (double) bush / totalVotes;
            JOptionPane.showMessageDialog(null,
                  "Barak Obama                     " + Math.round(percentObama * 100) + "%" +
                  "\nDonald J. Trump                " +Math.round(percentTrump * 100) + "%" +
                  "\nGeorge W. Bush                " + Math.round(percentBush * 100) + "%",
                  "MAYORAL ELECTION RESULTS", JOptionPane.INFORMATION_MESSAGE);
         }
   }

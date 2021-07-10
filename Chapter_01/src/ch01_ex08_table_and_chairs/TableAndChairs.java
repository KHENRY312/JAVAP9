/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch01_ex08_table_and_chairs;
import javax.swing.*;

/**
 * Project:            JAVAP9
 * Module:           Chapter_01
 * Package:          ch01_ex08_table_and_chairs
 * Class:              TableAndChairs
 * Programmer:   Kimberly Henry
 * Date:               Mon, 03-May-2021
 */
public class TableAndChairs
   {
      public static void main(String[] arg)
         {
            JOptionPane.showMessageDialog (null,
                  """
                        
                        **                                                              **
                        **                                                              **
                        **                                                              **
                        ************                             ************
                        **            **   ** ************** **             **
                        **            **   **                    **  **             **
                        **            **   **                    **  **             **
                        **            **   **                    **  **             **""",
                  "Table And Chairs",
                  JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
         }
   }

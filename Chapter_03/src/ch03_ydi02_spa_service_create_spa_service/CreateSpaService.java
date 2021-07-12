/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ydi02_spa_service_create_spa_service;
import java.util.Scanner;
/**
 * Project:            JP9
 * Module:           Chapter_03
 * Package:          ch03_ydi02_spa_service_create_spa_service
 * Class:              CreateSpaService
 * Programmer:   Kimberly Henry
 * Date:               Mon, 12-Jul-2021
 */
public class CreateSpaService
   {
      public static void main(String[] arg)
         {
            SpaService firstService = new SpaService();
            SpaService secondService = new SpaService();
            firstService = getData(firstService);
            secondService = getData(secondService);
            System.out.println("First Service Details");
            System.out.println(firstService.getServiceDescription() + "     $" + firstService.getPrice());
            System.out.println();
            System.out.println("Second Service Details");
            System.out.println(secondService.getServiceDescription() + "     $" + secondService.getPrice());
         }
      public static SpaService getData(SpaService services)
         {
            String service;
            double price;
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter spa service > >  ");
            service = keyboard.nextLine();
            System.out.print("Enter service price > >  ");
            price = keyboard.nextDouble();
            services.setServiceDescription(service);
            services.setPrice(price);
            return services;
         }
   }


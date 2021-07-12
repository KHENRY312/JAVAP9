/*
 * Copyright (c) 2021. Kimberly Henry This code shall not be used, manipulated, decompiled or
 * reproduced for other uses than educational; and not to be used in lieu of performing your own
 *  assignments.
 */

package ch03_ydi02_spa_service_create_spa_service;
/**
 * Project:            JP9
 * Module:           Chapter_03
 * Package:          ch03_ydi02_spa_service_create_spa_service
 * Class:              SpaService
 * Programmer:   Kimberly Henry
 * Date:               Mon, 12-Jul-2021
 */
public class SpaService
   {
      private String serviceDescription;
      private double price;
      
      public SpaService()
         {
            serviceDescription = "XXX";
            price = 0;
         }
      public String getServiceDescription()
         {
            return serviceDescription;
         }
      public void setServiceDescription(String service)
         {
            serviceDescription = service;
         }
      public double getPrice()
         {
            return price;
         }
      public void setPrice(double servicePrice)
         {
            price = servicePrice;
         }
   }

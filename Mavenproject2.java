
package com.mycompany.mavenproject2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author siyaryakar
 */
public class Mavenproject2 {

      public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100)+1; 
        }
        
          for (int i = 0; i < numbers.length; i++) {
              System.out.print(" " + numbers[i]);              
          }
          System.out.println("");
//tek sayı işlemleri
        int tekSayilarKareleriToplami = 0;
        int tekSayilarAdedi = 0;
        for (int num : numbers) {
            
       
            if (num % 2 != 0) { 
                num++;
             
              
                               
                tekSayilarKareleriToplami += num * num; 
                tekSayilarAdedi++;
                
            }
        }

        // çift sayı işlemleri
        double ciftSayilarToplamiKarekokleri = 0;
        int ciftSayilarAdedi = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
               
                ciftSayilarToplamiKarekokleri += Math.sqrt(num); 
                ciftSayilarAdedi++;
               
            }
        }

        System.out.println("Tek sayıların kareleri toplamı: " + tekSayilarKareleriToplami);
        System.out.println("Çift sayıların toplamı karekökleri: " + ciftSayilarToplamiKarekokleri);
        System.out.println("Tek sayıların adedi: " + tekSayilarAdedi);
        System.out.println("Çift sayıların adedi: " + ciftSayilarAdedi);
    }
    }

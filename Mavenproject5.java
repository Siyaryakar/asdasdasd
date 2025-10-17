/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author siyaryakar
 */
public class Mavenproject5 {

  public static int topla(int a) {
    if (0 <= a) 
    {   
      return (a + topla(a - 1));
    } 
    else {
      return 0;
    }
  }


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Klavyeden sayı giriniz");
    int n = scanner.nextInt();//klavyeden sayı istedik.
    int sonuc = topla(n);
    System.out.println("Girilen sayıdan 1'e kadar olan sayılar toplamı = "+sonuc);
  }

}

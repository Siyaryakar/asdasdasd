/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author siyaryakar
 */
public class Mavenproject10 {

 public static void main(String[] args) {
    int sonuc = toplam(4);
    System.out.println(sonuc );
    double[]dizi={1.1,2.3,3,4};
    toplam(dizi);
  }
  public static int toplam(double[] k,int b) {
    if (k[1] > 0) {
        
      return k * toplam(k - 1);
       
    } else {
       
      return 0;
    }
  }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject6;

import java.util.Scanner;


/**
 *
 * @author siyaryakar
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        
  
  Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz: ");
        int n = scanner.nextInt();

        // Kullanıcıdan alınan eleman sayısı kadar dizi oluşturulur
        int[] dizi = new int[n];

        System.out.println("Lütfen " + n + " adet sayıyı giriniz:");

        // Diziye elemanları kullanıcıdan alınır
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayı: ");
            dizi[i] = scanner.nextInt();
        }


int teksayac=0,ciftsayac=0;
        System.out.println("Dizi Elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
           
        }

        System.out.println("\n\nTek Sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 != 0) {
                System.out.print(dizi[i] + " ");
                teksayac++;
            }
            
        }

        System.out.println("\n\nÇift Sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                System.out.print(dizi[i] + " ");
                ciftsayac++;
            }
            
        }

        System.out.println("\n\nPozitif Sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > 0) {
                System.out.print(dizi[i] + " ");
            }
        }

        System.out.println("\n\nNegatif Sayılar:");
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < 0) {
                System.out.print(dizi[i] + " ");
            }
        }
        System.out.println("");
        System.out.println(teksayac + " tane tek sayı var");
        System.out.println("");
                System.out.println(ciftsayac + " tane çift sayı var");

    }
}


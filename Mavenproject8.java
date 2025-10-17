/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author siyaryakar
 */
public class Mavenproject8 {

    public static void main(String[] args) {

        int[] dizi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        dizi = new int[elemanSayisi];
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Dizi: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println(); 

        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];
        int toplam =dizi[0];

        for (int i = 1; i < elemanSayisi; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
            toplam += dizi[i];
        }

        System.out.println("En büyük eleman: " + enBuyuk);
        System.out.println("En küçük eleman: " + enKucuk);
        System.out.println("Tüm elemanların toplamı: " + toplam);

        System.out.println("Dizinin terse çevrilmiş hali: ");
        for (int i = elemanSayisi - 1; i >= 0; i--) {
            System.out.print(dizi[i] + " ");
        }
        }

    }


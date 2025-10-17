/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author siyaryakar
 */
public class Mavenproject9 {

    public static int[][] matrisToplami(int[][] matris1, int[][] matris2) {
    
        int satirSayisi = matris1.length;
        int sutunSayisi = matris1[0].length;
        int[][] toplamMatrisi = new int[satirSayisi][sutunSayisi];

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                toplamMatrisi[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        return toplamMatrisi;
    }

    public static int[][] matrisCarpimi(int[][] matris1, int[][] matris2) {
        int m = matris1.length;
        int n = matris1[0].length;
        int p = matris2[0].length;
        int[][] carpimMatrisi = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    carpimMatrisi[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }

        return carpimMatrisi;
    }

    public static void matrisiYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void matrisiDosyayaYazdir(int[][] matris, String dosyaAdi) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(dosyaAdi))) {
            for (int i = 0; i < matris.length; i++) {
                for (int j = 0; j < matris[0].length; j++) {
                    writer.print(matris[i][j] + " ");
                }
                writer.println();
            }
            System.out.println("Matris " + dosyaAdi + " dosyasına yazıldı.");
        } catch (IOException e) {
            System.err.println("Dosya yazma hatası: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk matrisin boyutlarını girin (satır sütun):");
        int satir1 = scanner.nextInt();
        int sutun1 = scanner.nextInt();

        System.out.println("İkinci matrisin boyutlarını girin (satır sütun):");
        int satir2 = scanner.nextInt();
        int sutun2 = scanner.nextInt();



        int[][] matris1 = new int[satir1][sutun1];
        int[][] matris2 = new int[satir2][sutun2];

        System.out.println("İlk matrisin elemanlarını girin:");
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                matris1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("İkinci matrisin elemanlarını girin:");
        for (int i = 0; i < satir2; i++) {
            for (int j = 0; j < sutun2; j++) {
                matris2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatris 1:");
        matrisiYazdir(matris1);

        System.out.println("\nMatris 2:");
        matrisiYazdir(matris2);

        System.out.println("\nMatrislerin Toplamı:");
        int[][] toplamMatrisi = matrisToplami(matris1, matris2);
        matrisiYazdir(toplamMatrisi);

        System.out.println("\nMatrislerin Çarpımı:");
        int[][] carpimMatrisi = matrisCarpimi(matris1, matris2);
        matrisiYazdir(carpimMatrisi);

         if (toplamMatrisi != null) {
            matrisiDosyayaYazdir(toplamMatrisi, "toplam_matris.txt");
            matrisiDosyayaYazdir(carpimMatrisi, "carpim_matris.txt");
        }

              
        
    }
}



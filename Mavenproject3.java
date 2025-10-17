

package com.mycompany.mavenproject3;

import java.util.Scanner;
               
public class Mavenproject3 {

 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();
        int kelimeSayisi = kelimeSayisiniHesapla(metin);
        System.out.println("Metindeki kelime sayısı: " + kelimeSayisi);
        scanner.close();
    }

    public static int kelimeSayisiniHesapla(String metin) {
        int kelimeSayisi = 0;
        boolean kelimeBaslangici = true;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == ' ' || metin.charAt(i) == '\t' || metin.charAt(i) == '\n' || metin.charAt(i) == '\r') {
                kelimeBaslangici = true;
            } else if (kelimeBaslangici) {
                kelimeSayisi++;
                kelimeBaslangici = false;
            }
        }
        return kelimeSayisi;
    }
}






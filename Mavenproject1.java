/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author siyaryakar
 */
public class Mavenproject1 {
    
      
    // Dosyaya yazma metodu (üzerine yazar veya ekleme yapabilir)
    public static void dosyayaYaz(String dosyaAdi, String icerik, boolean eklemeYap) {
        try {
            FileWriter dosyaYazici = new FileWriter(dosyaAdi, eklemeYap);
            dosyaYazici.write(icerik + "\n"); o            vbhbn 
            dosyaYazici.close();
            System.out.println("Dosyaya yazma işlemi tamamlandı.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazarken hata oluştu: " + e.getMessage());
        }
    }

    // Dosyadan okuma metodu (bütün içeriği döndürür)
    public static String dosyadanOku(String dosyaAdi) {
        StringBuilder sonuc = new StringBuilder();
        try {
            FileReader dosyaOkuyucu = new FileReader(dosyaAdi);
            BufferedReader okuyucu = new BufferedReader(dosyaOkuyucu);
            String satir;
            while ((satir = okuyucu.readLine()) != null) {
                sonuc.append(satir).append("\n");
            }
            okuyucu.close();
            dosyaOkuyucu.close();
        } catch (IOException e) {
            System.out.println("Dosyadan okurken hata oluştu: " + e.getMessage());
        }
        return sonuc.toString();
    }

    public static void main(String[] args) {
        String dosyaAdi = "ornek.txt";
        String icerik = "Merhaba, bu gelişmiş bir dosya işlemidir.";

        // Dosyaya yazma (Eski içeriği silerek)
        dosyayaYaz(dosyaAdi, icerik, false);

        // Dosyaya ekleme yapma (Önceki içeriği koruyarak yeni satır ekler)
        dosyayaYaz(dosyaAdi, "Bu satır dosyanın sonuna eklendi.", true);

        // Dosyadan okuma işlemi
        String okunanIcerik = dosyadanOku(dosyaAdi);
        System.out.println("Dosyadan okunan içerik:\n" + okunanIcerik);
    }
}

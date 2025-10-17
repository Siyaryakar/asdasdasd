/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author siyaryakar
 */
public class Mavenproject4 {
  public static void main(String[] args) {
     // Person sınıfından bir örnek oluşturuyoruz
        Person person = new Person("Ahmet", 30);
        person.name="ashjfkjas;";
        person.age=30;
        Person person2 = new Person ("Mehmet",22);

        // Oluşturduğumuz kişinin bilgilerini yazdırıyoruz
        System.out.println("Person: " + person.name);
                System.out.println("Person: " + person2);


  }


}

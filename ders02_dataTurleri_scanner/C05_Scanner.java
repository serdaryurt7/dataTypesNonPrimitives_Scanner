package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {


        //Kullanıcıdan bir double, bir de int sayi alıp bunların toplamını ve çarpımını yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lüften ondalıklı bir sayı giriniz.");
        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lüften bir tamsayı giriniz.");
        int tamSayi = scanner.nextInt();

        System.out.println("Toplam" + (ondalikliSayi + tamSayi));

        System.out.println("Çarpımı" + (ondalikliSayi * tamSayi));



    }

}

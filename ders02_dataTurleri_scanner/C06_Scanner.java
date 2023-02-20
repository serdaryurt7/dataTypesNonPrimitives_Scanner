package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("1. Kenar Uzunluğu Giriniz: ");
        double kenar1Uzunlugu = scan.nextDouble();
        System.out.println("2. Kenar Uzunluğu Giriniz: ");
        double kenar2Uzunlugu = scan.nextDouble();
        System.out.println("Dikdörtgenin Alanı: " + (kenar1Uzunlugu * kenar2Uzunlugu));

    }

}

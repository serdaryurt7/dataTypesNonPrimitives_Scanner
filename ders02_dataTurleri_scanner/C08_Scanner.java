package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz:");
        int sayi2 = scanner.nextInt();

        int bosDeger;

        bosDeger = sayi1;
        sayi1 = sayi2;
        sayi2 = bosDeger;

        System.out.println("Birinci sayı: " + sayi1);
        System.out.println("Ikinci sayı: " + sayi2);



    }
}

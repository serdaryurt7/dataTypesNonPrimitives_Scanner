package ders02_dataTurleri_scanner;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class C09_ScannerHW {

    public static void main(String[] args) {

        // Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan iki değeri değiştirme.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz:");

        int num1= scanner.nextInt();

        System.out.println("İkinci Sayıyı Giriniz:");

        int num2 = scanner.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1);
        System.out.println(num2);
    }
}

package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı Giriniz: ");

        String ad = scanner.nextLine();

        System.out.println("Soyadınızı Giriniz: ");

        String soyad = scanner.nextLine();

        System.out.println("Yasinizi Giriniz: ");

        byte yas = scanner.nextByte();

        System.out.println("İsminiz: " + ad + "\nSoyisminiz: " + soyad + "\nYasiniz: " + yas + "\nKaydınız Başarıyla Tamamnlanmıştır.");

    }
}

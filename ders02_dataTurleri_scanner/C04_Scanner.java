package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {


        //Kullanıcıdan ismini alıp büyük harflerle yazdırın


        //1.Adım: Scan objesi oluşturma.
        Scanner scan = new Scanner(System.in);

        //2.Adım: kullanınıcıdan ne istediğimizi yazdırma.
        System.out.println("Lütfen Adınızı Giriniz: ");

        //3.Adım: kullanıcıdan istediğimiz bilgiyi değişkene atama.
        String kullaniciAdi = scan.next();

        //4.Adım: Girdinin harflerinin hepsini büyüğe çevirip yazdırma.
        System.out.println(kullaniciAdi.toUpperCase());

    }

}

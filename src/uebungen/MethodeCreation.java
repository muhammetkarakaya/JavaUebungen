package uebungen;

import java.util.Scanner;

public class MethodeCreation {

    static String output = "";

    public static void main(String[] args) {
        /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir string ifade giriniz");
        String input = scan.nextLine();

        stringtekiHarfleriYazdir(input, 61, 13);


    }

    private static void stringtekiHarfleriYazdir(String input, int baslangic, int bitis) {
        if (baslangic > bitis) {
            System.err.println("hata!! baslangic degeri bitis degerinden büyük olamaz");
        } else if (baslangic > input.length() || bitis > input.length() - 1) {
            System.err.println("hata!! girilen deger String in sinirlari disinda bir degerdir");
        } else {
            input = input.replace(" ", "");
            for (int i = baslangic; i < bitis; i++) {
                output += input.charAt(i) + ",";

            }
            System.out.println(output);
        }
    }
}

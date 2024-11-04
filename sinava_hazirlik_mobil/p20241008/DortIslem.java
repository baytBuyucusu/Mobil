package com.example.p20241008;

import java.util.Scanner;

public class DortIslem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double sayi1,sayi2,sonuc;
        byte secim;
        System.out.println("1- TOPLAMA");
        System.out.println("2- ÇIKARMA");
        System.out.println("3- ÇARPMA");
        System.out.println("4- BÖLME");
        System.out.print("SEÇİNİZ:(1,2,3,4):");
        secim = scn.nextByte();
        System.out.print("Birinci sayıyı giriniz:");
        sayi1 = scn.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        sayi2 = scn.nextDouble();
        if (secim == 1) {
            sonuc = sayi1 + sayi2;
        } else if (secim ==2) {
            sonuc = sayi1-sayi2;
        } else if (secim == 3) {
            sonuc = sayi1* sayi2;
        }else{
            sonuc = sayi1/sayi2;
        }
        System.out.println("İşlemin sonucu:"+sonuc);
    }
}

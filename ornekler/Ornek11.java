package com.example.javaornekler;

import java.util.Scanner;

public class Ornek11 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float sayi1,sayi2,sonuc=0;
        int secim;

        System.out.print("1. Sayı: ");
        sayi1=oku.nextFloat();
        System.out.print("2. Sayı: ");
        sayi2=oku.nextFloat();


        System.out.println("**************************");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");
        System.out.println("**************************");

        System.out.print("Yapılacak İşlemi Seçin:");
        secim=oku.nextInt();

        if(secim==1){
            sonuc=sayi1+sayi2;
        }
        else if(secim==2){
            sonuc=sayi1-sayi2;
        }
        else if(secim==3){
            sonuc=sayi1*sayi2;
        }
        else if (secim==4) {
            sonuc=sayi1/sayi2;
        }
        else{
            System.out.println("Geçerli seçim yapınız.");
        }
        System.out.println("Sonuç: "+sonuc);
    }
}

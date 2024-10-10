package com.example.uygulama1;

import java.util.Scanner;

public class Ornek {

    public static void main(String[] args) {

        int yazili1, yazili2, ortalama;

        Scanner oku = new Scanner(System.in);

        System.out.println("Yazılı 1 Giriniz: ");
        yazili1 = oku.nextInt();

        System.out.println("Yazılı 2 Giriniz: ");
        yazili2 = oku.nextInt();

        ortalama = (yazili1 + yazili2) / 2;

        System.out.println("Ortalamanız= " + ortalama);// YORUM SATIRINA HOŞGELDİNİZ.


    }
}
package com.example.p20241008;

import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double not1,not2,ortalama;
        System.out.print("Birinci notu giriniz:");
        not1 = scn.nextDouble();
        System.out.print("İkinci notu giriniz:");
        not2 = scn.nextDouble();

        ortalama = (not1 + not2) /2;
        if (ortalama >= 50) {
            System.out.println("Geçtiniz : Ortalmanız = "+ ortalama);
        }
        else {
            System.out.println("Kaldınız : Ortalmanız = "+ ortalama);
        }
    }
}

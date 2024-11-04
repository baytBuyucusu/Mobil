package com.example.p20241008;

import java.util.Scanner;

public class Karar3 {
    public static void main(String[] args) {
        //Kullanıcının girdiği iki notun ortalamasına göre geçti kaldı
        int sicaklik;
        Scanner snc = new Scanner(System.in);
        System.out.print("Sıcaklık Değeri Giriniz:");
        sicaklik = snc.nextInt();
        if (sicaklik < 0) {
            System.out.println("KATI");
        } else if (sicaklik<=100) {
            System.out.println("SIVI");
        }else{
            System.out.println("GAZ");
        }

    }
}

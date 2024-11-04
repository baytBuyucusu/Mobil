package com.example.p20241008;

import java.util.Scanner;

public class For5 {    public static void main(String[] args) {
        //1)	1’den Kullanıcının girdiği sayıya kadar olan sayıların toplamı
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = scn.nextInt();
        int toplam=0;
        for (int i= 1;  i<=sayi ; i++) {
            toplam = toplam + i;         //toplam += i;
        }
        System.out.println("Toplam = " +  toplam);
    }

}

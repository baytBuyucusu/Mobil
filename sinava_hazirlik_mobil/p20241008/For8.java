package com.example.p20241008;

import java.util.Scanner;

public class For8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int  sayi,ciftToplam =0,tekToplam=0 ;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+".sayıyı giriniz:");
            sayi = scn.nextInt();
            if (sayi % 2 ==0) {
                ciftToplam +=sayi;
            }else {
                tekToplam += sayi;
            }

        }
        System.out.println("Çiftlerin Toplamı ="+ciftToplam);
        System.out.println("Teklerin Toplamı ="+tekToplam);
    }
}

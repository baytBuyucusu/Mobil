package com.example.p20241008;

import android.provider.Settings;

import java.util.Scanner;

public class Karar1 {
    public static void main(String[] args) {
        int sayi;
        Scanner snc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        sayi = snc.nextInt();
        if (sayi>0){
            System.out.println("Girdiğiniz sayı pozitif...");
        }else if (sayi<0){
            System.out.println("Girdiğniz sayı negatiftir....");
        }else{
            System.out.println("Girdiğiniz sayı nötr");
        }
        System.out.println("Program Bitti");
    }
}

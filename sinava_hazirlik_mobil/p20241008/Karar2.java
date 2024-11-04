package com.example.p20241008;

import java.util.Scanner;

public class Karar2 {
    public static void main(String[] args) {
        int sayi;
        Scanner snc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        sayi = snc.nextInt();
        if (sayi % 2 == 0){
            System.out.println("Girdiğiniz sayı ÇİFT...");
        }else{
            System.out.println("Girdiğiniz sayı TEK");
        }
        System.out.println("Program Bitti");
    }
}

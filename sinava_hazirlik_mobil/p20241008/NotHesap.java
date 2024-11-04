package com.example.p20241008;

import java.util.Scanner;

public class NotHesap {
    public static void main(String[] args) {
        int notunuz;
        Scanner snc = new Scanner(System.in);
        System.out.print("Notnuzu giriniz (0-100):");
        notunuz = snc.nextInt();
        if (notunuz < 0) {
            System.out.println("Hatalı sayı");
        }else if(notunuz<25){
            System.out.println("Sonuç:0");
        }else if(notunuz<45){
            System.out.println("Sonuç:1");
        }else if(notunuz<55){
            System.out.println("Sonuç:2");
        }else if(notunuz<70){
            System.out.println("Sonuç:3");
        }else if(notunuz<85){
            System.out.println("Sonuç:4");
        }else if(notunuz<=100){
            System.out.println("Sonuç:5");
        }else {
            System.out.println("Hatalı  değer");
        }
    }
}

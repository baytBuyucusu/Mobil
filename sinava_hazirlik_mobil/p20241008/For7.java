package com.example.p20241008;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz:");
        int sayi = scn.nextInt();
        long carpim=1;
        for (int i= 1;  i<=sayi ; i++) {
            carpim = carpim * i;    //carpim *=i;
        }
        System.out.println("Sonuç = " +  carpim);
    }
}

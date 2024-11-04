package com.example.p20241008;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        //1'den kullanıcının girdiği sayıya kadar olan,5'e bölünen sayıları sırayla ekrana
        // yazan kod
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scn.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

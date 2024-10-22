package com.example.javaornekler;

import java.util.Scanner;

public class Ornek18 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int sayi1,sayi2,toplam=0;
        System.out.print("1. Sayı:");
        sayi1= oku.nextInt();
        System.out.print("2. Sayı:");
        sayi2= oku.nextInt();

        for(int i=sayi1;i<=sayi2;i++){
            toplam+=i;
        }
        System.out.print("Toplam: "+toplam);
    }
}

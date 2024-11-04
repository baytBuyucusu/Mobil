package com.example.javaornekler;

import java.util.Scanner;

public class Ornek19 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int sayi,sonuc=1;
        System.out.print("Sayı Giriniz:");
        sayi= oku.nextInt();

        for(int i=1;i<=sayi;i++){
            sonuc*=i;
        }
        System.out.println("Sonuç: "+sonuc);
    }
}

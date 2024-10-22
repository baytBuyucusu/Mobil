package com.example.javaornekler;

import java.util.Scanner;

public class Ornek14 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi,toplam=0;

        for (int i=1;i<=10;i++){
            System.out.print(i+". Sayı: ");
            sayi=oku.nextInt();
            //toplam=toplam+sayi;
            toplam+=sayi;
        }
        System.out.println("Toplam: "+toplam);


        Ogrenci ogrenci=new Ogrenci("Ali","Altı");




    }
}

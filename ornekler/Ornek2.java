package com.example.javaornekler;

import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {

        int fiyat,adet,toplam;
        Scanner oku=new Scanner(System.in);

        System.out.print("Fiyat Gir: ");
        fiyat=oku.nextInt();

        System.out.print("Adet Gir: ");
        adet= oku.nextInt();

        toplam=adet*fiyat;

        System.out.println("Ödenecek Tutar: "+toplam+"₺");


    }
}

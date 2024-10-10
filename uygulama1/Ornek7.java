package com.example.uygulama1;

import java.util.Scanner;

public class Ornek7 {

    public static void main(String[] args) {

        double maas,zam,yeniMaas;

        Scanner oku =new Scanner(System.in);

        System.out.println("Aldığınız Maaş: ");

       maas= oku.nextDouble();

        System.out.println("Yüzde Kaç Zam İstersiniz");

        zam= oku.nextDouble();

        yeniMaas=maas+(maas*zam/100);

        System.out.println("Yeni Maaşınız: "+yeniMaas);




    }
}

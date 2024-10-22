package com.example.javaornekler;

import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        double maas,oran,yeniMaas;

        System.out.print("Maaşı Gir: ");
        maas= oku.nextDouble();

        System.out.print("Zam Oranı Gir(%): ");
        oran= oku.nextDouble();

        yeniMaas=maas+(maas*oran/100);

        System.out.println("Yeni Maaşınız: "+yeniMaas);
    }
}

package com.example.uygulama1;

import java.util.Scanner;

public class Ornek6 {

    public static void main(String[] args) {

        double personelMaas,zam;

        Scanner oku =new Scanner(System.in);

        System.out.println("Aldığınız Yeni Maaş: ");

        personelMaas= oku.nextDouble();



        zam=personelMaas+(personelMaas*0.43);

        System.out.println("Alıcağınız Maaş: "+zam);





    }




}

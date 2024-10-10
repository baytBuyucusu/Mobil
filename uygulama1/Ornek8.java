package com.example.uygulama1;

import java.util.Scanner;

public class Ornek8 {

    public static void main(String[] args) {

      double a,b,c;

        Scanner oku= new Scanner(System.in);

        System.out.println("a sayısını ver: ");
        a= oku.nextDouble();

        System.out.println("b sayısını ver: ");
        b= oku.nextDouble();

        c=Math.sqrt(a*a+b*b);

        System.out.println("Sonuç: "+c);


    }
}

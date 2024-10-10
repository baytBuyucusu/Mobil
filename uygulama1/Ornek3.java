package com.example.uygulama1;

import java.util.Scanner;

public class Ornek3 {

    public static void main(String[] args) {

        int cevre,alan,kisaKenar,uzunKenar;

        Scanner oku=new Scanner(System.in);

        System.out.println("Kısa Kenarı Giriniz: ");

        System.out.println("Uzun Kenarı Giriniz: ");

        kisaKenar= oku.nextInt();
        uzunKenar= oku.nextInt();

        cevre=(kisaKenar+uzunKenar)*2;

        alan=kisaKenar*uzunKenar;

        System.out.println("Çevre: "+cevre);

        System.out.println("Alan: "+alan);





    }
}

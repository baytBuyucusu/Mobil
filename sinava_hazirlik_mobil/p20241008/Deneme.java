package com.example.p20241008;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Uzunluğu Giriniz(inç):");
        int inc = oku.nextInt();
        double cm = inc*2.54;
        //System.out.println("Sonuc="+cm);
        System.out.println(inc +"inç = "+cm+"cm");


    }
}

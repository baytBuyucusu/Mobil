package com.example.p20241008;

import java.util.Scanner;

public class CemberAlan {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        double r,alan,cevre;
        final double PI = 3.14;
        System.out.print("Çemberin Yarıçapını Giriniz:");
        r = oku.nextDouble();
        alan = PI * r * r;
        cevre = 2 * PI * r;
        System.out.println("Çevre="+cevre);
        System.out.println("Alan="+alan);
    }
}

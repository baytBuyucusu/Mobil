package com.example.uygulama1;

import java.util.Scanner;

public class Ornek5 {

    public static void main(String[] args) {

        double yariCap,alan,cevre;

        Scanner oku=new Scanner(System.in);

        System.out.println("Daire Yarıçap ını girin: ");
        yariCap= oku.nextFloat();

        alan=3.14*yariCap;

        cevre=2*3.14*yariCap;

        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);







    }
}

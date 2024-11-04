package com.example.javaornekler;

import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        double r,cevre,alan;
        final double PI=3.14;



        System.out.print("Yarıçapı Girin: ");
        r=oku.nextDouble();

        cevre= Math.round(2*PI*r) ;
        alan=PI*r*r;




        System.out.println("Alan: "+alan);
        System.out.println("Çevre: "+cevre);
    }
}

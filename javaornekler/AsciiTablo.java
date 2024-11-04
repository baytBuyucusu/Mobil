package com.example.javaornekler;

import java.util.Scanner;

public class AsciiTablo {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        double a,b,c;

        System.out.print("A Kenarını Girin: ");
        a=oku.nextDouble();
        System.out.print("B Kenarını Girin: ");
        b=oku.nextDouble();

        c=Math.sqrt(a*a+b*b);

        System.out.println("Hipotenüs: "+c);





    }
}
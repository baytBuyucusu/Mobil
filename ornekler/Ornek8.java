package com.example.javaornekler;

import java.util.Scanner;

public class Ornek8 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        float y1,y2,ortalama;

        System.out.print("1. Yazılı: ");
        y1=oku.nextFloat();
        System.out.print("2. Yazılı: ");
        y2= oku.nextFloat();

        ortalama=(y1+y2)/2;

        System.out.println("Ortalama: "+ortalama);

        if(ortalama>=50){
            System.out.println("Tebrikler. Geçtiniz.");
        }
        else{
            System.out.println("Kaldınız. Üzgünüm ama hakettin.");
        }







    }
}

package com.example.javaornekler;

import java.util.Scanner;

public class Ornek12 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float ortalama,devamsizlik;

        System.out.print("Ortalama: ");
        ortalama=oku.nextFloat();
        System.out.print("Devamsızlık: ");
        devamsizlik=oku.nextFloat();

        /*if(ortalama>=50 && devamsizlik<10){
            System.out.println("Geçtiniz.");
        }
        else{
            System.out.println("Kaldınız.");
        }*/

        if(ortalama<50 || devamsizlik>10){
            System.out.println("Kaldınız");
        }
        else{
            System.out.println("Geçtiniz");
        }



    }
}

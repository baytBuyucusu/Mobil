package com.example.javaornekler;

import java.util.Scanner;

public class Ornek10 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Ortalama: ");
        int ortalama=oku.nextInt();

        if(ortalama>=0 && ortalama<50){
            System.out.println("1 ile kaldınız.");
        }
        else if(ortalama>=50 && ortalama<60){
            System.out.println("2 ile geçtiniz.");
        }
        else if(ortalama>=60 && ortalama<70){
            System.out.println("3 ile geçtiniz.");
        }
        else if(ortalama>=70 && ortalama<85){
            System.out.println("4 ile geçtiniz.");
        }
        else if(ortalama>=85 && ortalama<=100){
            System.out.println("5 ile geçtiniz.");
        }
        else{
            System.out.println("0-100 arası bir puan girin.");
        }

    }
}

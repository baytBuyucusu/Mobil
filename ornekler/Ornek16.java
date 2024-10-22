package com.example.javaornekler;

import java.util.Scanner;

public class Ornek16 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi,buyuk=0,kucuk=0;

        for (int i=1;i<=10;i++){
            System.out.print(i+" . Sayı gir:");
            sayi= oku.nextInt();

            if(sayi>=50){
                buyuk++;
            }
            else{
                kucuk++;
            }



        }
        System.out.println("50 den büyük sayı adeti;"+buyuk);
        System.out.println("50 den küçük sayı adeti;"+kucuk);
    }
}

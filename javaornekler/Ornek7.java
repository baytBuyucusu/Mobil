package com.example.javaornekler;

import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı Gir: ");
        int sayi= oku.nextInt();

        if(sayi%2==0){
            System.out.println("Sayı Çift.");
        }
        else{
            System.out.println("Sayı Tek.");
        }


    }
}

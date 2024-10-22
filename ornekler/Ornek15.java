package com.example.javaornekler;

import java.util.Scanner;

public class Ornek15 {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);

        int sonuc=0;

        for (int i=1;i<=100;i++){
          sonuc+=i;
        }
        System.out.println("sonuc "+sonuc);

    }
}

package com.example.javaornekler;

import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int derece;

        System.out.print("Sıcaklık Derecesi: ");
        derece= oku.nextInt();

        if(derece<=5){
            System.out.println("Çok Soğuk");
        }
        else if(derece<=20){
            System.out.println("Soğuk");
        }
        else if(derece<=27){
            System.out.println("Normal");
        }
        else if(derece<=35){
            System.out.println("Sıcak");
        }
        else {
            System.out.println("Çok Sıcak");
        }

    }
}

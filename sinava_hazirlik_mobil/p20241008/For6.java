package com.example.p20241008;

import java.util.Scanner;

public class For6 {
    public static void main(String[] args) {
        //1)	Kullanıcının girdiği ilk sayıdann Kullanıcının girdiği ikinci sayıya
        // kadar olan sayıların toplamı
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir küçük sayıyı giriniz:");
        int ksayi = scn.nextInt();
        System.out.print("Bir büyük sayıyı giriniz:");
        int bsayi = scn.nextInt();
        int toplam=0;
        for (int i= ksayi;  i<=bsayi ; i++) {
            toplam = toplam + i;         //toplam += i;
        }
        System.out.println("Toplam = " +  toplam);
    }
}

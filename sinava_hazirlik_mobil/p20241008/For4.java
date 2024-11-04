package com.example.p20241008;

public class For4 {
    public static void main(String[] args) {
        //1)	1’den 10’a kadar olan sayıların toplamı
        int toplam=0;
        for (int i= 1;  i<=10 ; i++) {
            toplam = toplam + i;         //toplam += i;
        }
        System.out.println("Toplam = " +  toplam);
    }
}

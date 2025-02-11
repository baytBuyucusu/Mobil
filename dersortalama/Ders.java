package com.example.dersortalama;

import java.util.Locale;

public class Ders {
    String dersAdi;
    int not1;
    int not2;
    double ortalama;
    String durum;

    public Ders(String dersAdi, int not1, int not2) {
        this.setDersAdi(dersAdi);
        this.setNot1(not1);
        this.setNot2(not2);
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi.toUpperCase();
    }

    public int getNot1() {
        return not1;
    }

    public void setNot1(int not1) {
        if(not1>100){
            this.not1 = 100;
        }
        else{
            this.not1 = not1;
        }

    }

    public int getNot2() {
        return not2;
    }

    public void setNot2(int not2) {

        if(not2>100){
            this.not2 = 100;
        }
        else{
            this.not2 = not2;
        }

    }

    public double getOrtalama() {
        return ortalamaHesapla();
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public String getDurum() {
        return durumHesapla();
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public double ortalamaHesapla(){
        ortalama=(not1+not2)/2.0;
        return ortalama;
    }

    public String durumHesapla(){
        if(ortalama>=50){
            return "Geçti";
        }
        else{
            return "Kaldı";
        }
    }

    public String dersBilgi(){
        return dersAdi+" Ortalama: "+getOrtalama()+" ("+getDurum()+")";
    }




}

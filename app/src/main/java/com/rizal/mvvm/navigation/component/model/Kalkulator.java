package com.rizal.mvvm.navigation.component.model;

public class Kalkulator {

    private double nilai1, nilai2, hasil;

    public Kalkulator(double nilai1, double nilai2) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }

    public Kalkulator() {
    }

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
}

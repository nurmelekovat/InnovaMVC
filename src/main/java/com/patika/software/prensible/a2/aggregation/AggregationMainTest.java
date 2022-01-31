package com.patika.software.prensible.a2.aggregation;

public class AggregationMainTest {
    // Motor =1
    // Araba>1 fazla

    public static void main(String[] args) {
        Araba araba=new Araba();
        double fiyat=  araba.getToplamFiyat();
        System.out.println(fiyat);
    }
}

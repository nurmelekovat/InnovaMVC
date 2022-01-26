package com.patika.tutorials;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
//@NoArgsConstructor:aşağıda alt+ınsert ile parametresiz constructor oluşturduğumuz için buna gerek yok.ikisinden biri olmalı.
@AllArgsConstructor
@Builder
@Log4j2 //log bilgilerini getiriyor
public class Log4j2Tutorials {
        private  String adi;
        private  String soyadi;
        private  String numarasi;

    public Log4j2Tutorials() {
        this.adi="adınızı girmediniz";
        this.soyadi="soyadınızı girmediniz";
        this.numarasi="numaranızı girmediniz";
    }
    //Shift+F6:Class adını değiştirir.(Refactor)
    //Alt+insert=getter,setter,constructor
    //CTRL+shift+o:maven install
    public static void main(String[] args) {
        Log4j2Tutorials tutorials=new Log4j2Tutorials();
        System.out.println(tutorials);

        if (tutorials.getAdi().equals("adınızı girmediniz")){
            log.error("Hata adınızı girmediniz!!!!");
        }else{
            log.info("Bilgiler girildi.");
        }
    }
}

package com.patika.tutorials;

import lombok.Data;
import  lombok.*;
import java.util.Objects;

@Data //getter setter+hashcode+toString
@NoArgsConstructor //Parametresiz constructor
@AllArgsConstructor //Parametreli constructor
@Builder
public class LombokTutorials {
    //@Getter @Setter
    private  String adi;
    //@Getter @Setter
    private  String soyadi;
    //@Getter @Setter
    private  String numarasi;

    @Override
    public String toString() {
        return "LombokTutorials{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", numarasi='" + numarasi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LombokTutorials tutorials= LombokTutorials.builder().adi("Nurmelek").numarasi("123dkssjdjd44").build();
        System.out.println(tutorials);
    }

    /*public LombokTutorials() {
    }
    public LombokTutorials(String adi, String soyadi, String numarasi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.numarasi = numarasi;
    }
    @Override
    public String toString() {
        return "LombokTutorials{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", numarasi='" + numarasi + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LombokTutorials that = (LombokTutorials) o;
        return Objects.equals(adi, that.adi) && Objects.equals(soyadi, that.soyadi) && Objects.equals(numarasi, that.numarasi);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adi, soyadi, numarasi);
    }
    public String getAdi() {
        return adi;
    }
    public void setAdi(String adi) {
        this.adi = adi;
    }
    public String getSoyadi() {
        return soyadi;
    }
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    public String getNumarasi() {
        return numarasi;
    }
    public void setNumarasi(String numarasi) {
        this.numarasi = numarasi;
    }*/

}

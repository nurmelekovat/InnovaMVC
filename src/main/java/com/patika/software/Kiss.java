package com.patika.software;

import lombok.extern.log4j.Log4j2;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

@Log4j2
//Keep It Simple Stupid : Olabildiğince herşeyi en basit yöntemle çöz
public class Kiss {
private static String path="C:\\Patika\\Patika.txt";
    //File Writer
    public void utilWriter(){
        //try with resourcuses
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(path,true))){
            String value = JOptionPane.showInputDialog("Lütfen birşeyler giriniz");
            bufferedWriter.write(value);
            bufferedWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //File Reader
    public void utilReader() {
        //try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String numberRow = "", sumRow = "";
            while ((numberRow = bufferedReader.readLine()) != null) {
                sumRow += numberRow;
            }
            log.info(sumRow);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Kiss kiss = new Kiss();
        //kiss.utilWriter();
        kiss.utilReader();


    }



}

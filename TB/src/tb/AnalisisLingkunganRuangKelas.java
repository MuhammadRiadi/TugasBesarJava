/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

import java.util.Scanner;

/**
 *
 * @author Predator
 */
abstract public class AnalisisLingkunganRuangKelas  {
        Scanner scan=new Scanner(System.in);
    private int lantai;
    private int dinding;
    private int atap;
    private int pintu;
    private int jendela;

    public AnalisisLingkunganRuangKelas(int lantai, int dinding, int atap, int pintu, int jendela) {
        this.lantai = lantai;
        this.dinding = dinding;
        this.atap = atap;
        this.pintu = pintu;
        this.jendela = jendela;
    }
    
    

    public int getLantai() {
        switch(lantai){
            case 1: System.out.println("Lantai = Bersih");
                break;
            case 2: System.out.println("Lantai = Tidak Bersih ");
                break;
            }
        return lantai;
    }

    public String setLantai(int lantai) {
        this.lantai = lantai;
        if(lantai==1){
            return "Bersih";
        }
        else{
            return "Kurang Bersih"; 
    }
    }

    public int getDinding() {
        switch(dinding){
            case 1: System.out.println("Dinding = Bersih");
                break;
            case 2: System.out.println("Dinding = Tidak Bersih ");
                break;}
        return dinding;
    }

    public String setDinding(int dinding) {
        this.dinding = dinding;
        if(dinding==1){
            return "Bersih";
        }
        else{
            return "Kurang Bersih";
    }
    }

    public int getAtap() {
        
    switch(atap){
            case 1: System.out.println("Atap = Bersih");
                break;
            case 2: System.out.println("Atap = Tidak Bersih ");
                break;
            }
        return atap;
    }

    public String setAtap(int atap) {
        this.atap = atap;
        if(atap==1){
            return "Bersih";
        }
        else{
            return "Kurang Bersih";
    }
    }

    public int getPintu() {
        switch(pintu){
            case 1: System.out.println("Pintu = Bersih");
                break;
            case 2: System.out.println("Pintu = Tidak Bersih ");
                break;}
        return pintu;
    }

    public String setPintu(int pintu) {
        this.pintu = pintu;
        if(pintu==1){
            return "Bersih";
        }
        else{
            return "Kurang Bersih";
    }
    }

    public int getJendela() {
        switch(jendela){
            case 1: System.out.println("Jendela = Bersih");
                break;
            case 2: System.out.println("Keausan = Tidak Bersih");
                break;
            }
        return jendela;
    }

    public String setJendela(int jendela) {
        this.jendela = jendela;
        if(jendela==1){
            return "Bersih";
        }
        else{
            return "Kurang Bersih";
    }
    }

    
        
   abstract void InputLingkungan();
        
   abstract void OutputLingkungan();
    
    
}

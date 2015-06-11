/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

import java.util.Scanner;
abstract public class AnalisiKondisiRuangKelas  {
    private int panjang;
    private int lebar;
    private int luas;
    private int jumlahkursi;
    private double rasio;
    private int pintu;
    private int jendela;
    private String bentuk;
    private String PintuJendela;
    
    Scanner scan=new Scanner(System.in);

    public AnalisiKondisiRuangKelas(int panjang, int lebar, int luas, int jumlahkursi, double rasio, int pintu, int jendela) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = luas;
        this.jumlahkursi = jumlahkursi;
        this.rasio = rasio;
        this.pintu = pintu;
        this.jendela = jendela;
    }
    

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLuas() {
        luas = getPanjang()*getLebar();
        
        return luas;
    }
    
    public String Bentuk(){
        if(getPanjang()==getLebar()){
            return "Bentuk Persegi";
        }
        else return " Bentuk Persegi Panjang";
    }
    
    public int getJumlahkursi() {
        return jumlahkursi;
    }

    public void setJumlahkursi(int jumlahkursi) {
        this.jumlahkursi = jumlahkursi;
    }

    public String getRasio( ) {
        rasio=getLuas()/getJumlahkursi();
        
                if(rasio >= 0.5){
                    return "Sesuai";
                }
                else{
                    return "Tidak Sesuai";}
                
                
                
        
        
    }
    
   
    
    
    
    public int getPintu() {
        
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
       
        
    }

    public int getJendela() {
      
        
        return jendela;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public void setJendela(int jendela) {
        this.jendela = jendela;
        
    }
        
     public String getPintuJendela(){
         if(getPintu()>=2 && getJendela()>=1 ) {
             return "Sesuai";
        } else return "Tidak Sesuai";
         
     }
        

    
    abstract void Luas();
    abstract void Rasio();
    abstract void PintuJendela();
    abstract void OutputRuangKelas();
    
    
}

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
    private String lantai;
    private String dinding;
    private String atap;
    private String pintu;
    private String jendela;

    public AnalisisLingkunganRuangKelas(String lantai, String dinding, String atap, String pintu, String jendela) {
        this.lantai = lantai;
        this.dinding = dinding;
        this.atap = atap;
        this.pintu = pintu;
        this.jendela = jendela;
    }
    
    

    public String getLantai() {
        if(lantai.equalsIgnoreCase("Bersih")){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai"; 
    }
        
    }

    public void setLantai(String lantai) {
        this.lantai = lantai;
       
    }

    public String getDinding() {
         if(dinding.equalsIgnoreCase("Bersih")){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai"; 
    }
    }

    public void setDinding(String dinding) {
        this.dinding = dinding;
        
    }

    public String getAtap() {
        
     if(atap.equalsIgnoreCase("Bersih")){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai"; 
    }
    }

    public void setAtap(String atap) {
        this.atap = atap;
    }

    public String getPintu() {
        if(pintu.equalsIgnoreCase("Bersih")){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai"; 
    }
    }

    public void setPintu(String pintu) {
        this.pintu = pintu;
        
    }

    public String getJendela() {
         if(jendela.equalsIgnoreCase("Bersih")){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai"; 
         }
    }

    public void setJendela(String jendela) {
        this.jendela = jendela;
        
    }

    

   abstract void InputLingkungan();
        
   abstract void OutputLingkungan();
    
    
}

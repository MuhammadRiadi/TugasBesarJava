
package finaltb;

import java.util.Scanner;

abstract public class AnalisisKebersihanRuangKelas {
    Scanner scan=new Scanner(System.in);
    private int udara;
    private int cahaya;
    private int kelembapan;
    private int suhu;

    public AnalisisKebersihanRuangKelas(int udara, int cahaya, int kelembapan, int suhu) {
        this.udara = udara;
        this.cahaya = cahaya;
        this.kelembapan = kelembapan;
        this.suhu = suhu;
    }
    
    

    public int getSuhu() {
         if(25 >= suhu || suhu <=35 ){
               System.out.println("Suhu="+cahaya+"Sesuai");  
        }
        else{
             System.out.println("Suhu="+cahaya+"Tidak Sesuai");  
        }
        
        return suhu;
    }

    public String setSuhu(int suhu) {
        this.suhu = suhu;
        if(suhu>=25&&suhu<=35){
               return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }//To change body of generated methods, choose Tools | Templates.
    }
        
    
    public int getCahaya() {
        if(250>=cahaya&&cahaya<=350){
               System.out.println("Cahaya="+cahaya+"Sesuai");  
        }
        else{
             System.out.println("Cahaya="+cahaya+"Tidak Sesuai");  
        }
        return cahaya;
    }

    public String setCahaya(int cahaya) {
        this.cahaya = cahaya;
         if(cahaya>=250&&cahaya<=350){
               return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }
    
    }

    public int getUdara() {
        switch(udara){
            case 1: System.out.println("Siklus Udara = Lancar");
                break;
            case 2: System.out.println("Siklus Udara = Tidak Lancar ");
                break;}
        return udara;
    }

    public String setUdara(int udara) {
        this.udara = udara;
        if(udara==1){
              return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }
        } 
    

 

    public int getKelembapan() {
        if(250>=kelembapan&&kelembapan<=350){
               System.out.println("Kelembapan="+kelembapan+"Sesuai");  
        }
        else{
             System.out.println("Kelembapan="+kelembapan+"Tidak Sesuai");  
        }
        return kelembapan;
    }

    public String setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
         if(kelembapan>=70&&kelembapan<=80){
               return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
         }
    }
    
    
    abstract void SirkulasiUdara();
    abstract void Pencahayaan();
    abstract void Kelembapan();
    abstract void Suhu();
    abstract void OutputKebersihan();
    }


    

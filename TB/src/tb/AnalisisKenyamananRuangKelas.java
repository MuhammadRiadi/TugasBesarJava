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
abstract public class AnalisisKenyamananRuangKelas {
    Scanner scan=new Scanner(System.in);
        private int bising;
        private int bau;
        private int kebocoran;
        private int kerusakan;
        private int keausan;

    public AnalisisKenyamananRuangKelas(int bising, int bau, int kebocoran, int kerusakan, int keausan) {
        this.bising = bising;
        this.bau = bau;
        this.kebocoran = kebocoran;
        this.kerusakan = kerusakan;
        this.keausan = keausan;
    }
        
        
        
    public int getBising() {
        switch(bising){
            case 1: System.out.println("Kebisingan = Iya");
                break;
            case 2: System.out.println("Kebisingan = Tidak ");
                
        }
        return bising;
    }

    public String setBising(int bising) {
        this.bising = bising;
        if(bising==1){
            return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
            
        }
    }

    public int getBau() {
        switch(bau){
            case 1: System.out.println("Bau = Iya");
                break;
            case 2: System.out.println("Bau = Tidak ");
        break;
    }
        return bau;
    }

    public String setBau(int bau) {
        this.bau = bau;
        if(bau==2){
            return "Sesuai";
        }
        else{
            return "Tidak Sesuai";
        }
    }

    public int getKebocoran() {
        switch(kebocoran){
            case 1: System.out.println("Kebocoran = Iya");
                break;
            case 2: System.out.println("Kebocoran = Tidak ");
                break;
        }
        return kebocoran;
    }

    public String setKebocoran(int kebocoran) {
        this.kebocoran = kebocoran;
        if(kebocoran==2){
            return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }
    }

    public int getKerusakan() {
        switch(kerusakan){
            case 1: System.out.println("Kerusakan = Iya");
                break;
            case 2: System.out.println("Kerusakan = Tidak ");
                break;
        }   
        return kerusakan;
    }

    public String setKerusakan(int kerusakan) {
        this.kerusakan = kerusakan;
        if(kerusakan==2){
            return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }
    }

    public int getKeausan() {
        
            switch(keausan){
            case 1: System.out.println("Keausan = Iya");
                break;
            case 2: System.out.println("Keausan = Tidak ");
                break;
            }
        return keausan;
    }

    public String setKeausan(int keausan) {
        this.keausan = keausan;
        if(keausan==2){
            return "Sesuai"; 
        }
        else{
            return "Tidak Sesuai";
        }
    }
    
    abstract void Bising();
    abstract void Bau();
    abstract void Kebocoran();
    abstract void Kerusakan();
    abstract void Keausan();
    abstract void OutKenyamanan();
    
    

}

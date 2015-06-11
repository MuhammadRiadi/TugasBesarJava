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
        private String bising;
        private String bau;
        private String kebocoran;
        private String kerusakan;
        private String keausan;

    public AnalisisKenyamananRuangKelas(String bising, String bau, String kebocoran, String kerusakan, String keausan) {
        this.bising = bising;
        this.bau = bau;
        this.kebocoran = kebocoran;
        this.kerusakan = kerusakan;
        this.keausan = keausan;
    }
        
        
        
    public String getBising() {
        if("Iya".equalsIgnoreCase(bising)){
            return "Tidak Sesuai";
        }
        else return "Tidak Sesuai";
   
    }
    

    public void setBising(String bising) {
        this.bising = bising;
       
    }

    public String getBau() {
        if(bau.equalsIgnoreCase("Iya")){
            return "Tidak Sesuai";  
        }
        else{
            return "Sesuai";
            
        }
       
       
    }

    public void setBau(String bau) {
        this.bau = bau;
       
    }

    public String getKebocoran() {
         if(kebocoran.equalsIgnoreCase("Iya")){
            return "Tidak Sesuai";  
        }
        else{
            return "Sesuai";
            
        }
       
        
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
        
    }

    public String getKerusakan() {
        if(kerusakan.equalsIgnoreCase("Iya")){
            return "Tidak Sesuai";  
        }
        else{
            return "Sesuai";
            
        }
       
        
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
       
    }

    public String getKeausan() {
        
        if(keausan.equalsIgnoreCase("Iya")){
            return "Tidak Sesuai";  
        }
        else{
            return "Sesuai";
            
        }   
        
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
       
    }
    
    
    
   
    
    
    
    abstract void Bising();
    abstract void Bau();
    abstract void Kebocoran();
    abstract void Kerusakan();
    abstract void Keausan();
    abstract void OutKenyamanan();
    
    

}

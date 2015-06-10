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
abstract public class AnalisisKeamananRuangKelas  {
     Scanner scan=new Scanner(System.in);
    private String kekokohan;
    private String kunci;
    private String keamanan;
    
    public AnalisisKeamananRuangKelas(String kekokohan,String kunci, String keamanan){
        this.kekokohan=kekokohan;
        this.kunci=kunci;
        this.keamanan=keamanan;
    }
    

    public String getKekokohan() {
        if(kekokohan.equalsIgnoreCase("KOKOH")){
            return "Sesuai";
        }
        else return "Tidak Sesuai";
       
         
        
    }

    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
       
    }
    

    public String getKunci() {
        if(kunci.equalsIgnoreCase("ADA")){
            return "Sesuai";
        }
        else return "Tidak Sesuai";
       
        
    }

    public void setKunci(String kunci) {
     this.kunci=kunci;  
        
       
    }

    public String getKeamanan() {
        if(keamanan.equalsIgnoreCase("AMAN")){
            return "Sesuai";
        }
        else return "Tidak Sesuai";
        
        
    }

    public void setKeamanan(String keamanan) {
        this.keamanan = keamanan;
       
    }
    
   
    
 
    
    
    
 abstract void Keamanan();
 abstract void Kuncipintujendela();
 abstract void Kekokohan();
 abstract void OutputKeamanan();

    
    
}

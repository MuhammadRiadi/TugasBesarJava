
package finaltb;

import java.util.Scanner;

abstract public class AnalisisKebersihanRuangKelas {
    Scanner scan=new Scanner(System.in);
    private String udara;
    private int cahaya;
    private int kelembapan;
    private int suhu;

    public AnalisisKebersihanRuangKelas(String udara, int cahaya, int kelembapan, int suhu) {
        this.udara = udara;
        this.cahaya = cahaya;
        this.kelembapan = kelembapan;
        this.suhu = suhu;
    }
    
    

    public int getSuhu() {
         
        
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
      
    }
        
    
    public String getCahaya() {
        if(cahaya>=250&&cahaya<=350){
               return "Sesuai";  
        }
        else{
             return "Tidak Sesuai";  
        }
       
        
    }

    public void setCahaya(int cahaya) {
        this.cahaya = cahaya;
         
    }

    public String getUdara() {
         if("LANCAR".equals(getUdara())){
              return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }
        
        
    }

    public void setUdara(String udara) {
        this.udara = udara;
        
        } 
    

 

    public String getKelembapan() {
        if(kelembapan>=250 &&kelembapan<=350){
              return "Sesuai";  
        }
        else{
             return "Tidak Sesuai";  
        }
        
        
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
         
    }
    
    public String AnlsSuhu(){
         if(25 >= getSuhu() || getSuhu() <=35 ){
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


    

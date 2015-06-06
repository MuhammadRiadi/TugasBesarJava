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
    private int kekokohan;
    private int kunci;
    private int keamanan;
    
    public AnalisisKeamananRuangKelas(int kekokohan,int kunci, int keamanan){
        this.kekokohan=kekokohan;
        this.kunci=kunci;
        this.keamanan=keamanan;
    }
    

    public int getKekokohan() {
        switch(kekokohan){
            case 1: System.out.println("Kekokohan = Kokoh");
                break;
            case 2: System.out.println("Kekokohan = Tidak Kokoh ");}
        return kekokohan;
    }

    public void setKekokohan(int kekokohan) {
        this.kekokohan = kekokohan;
        if(kekokohan==1){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }
    }
    

    public int getKunci() {
        switch(kunci){
            case 1: System.out.println("Kunci Pintu dan Jendela = Ada");
                break;
            case 2: System.out.println("Kunci Pintu dan Jendela = Tidak Ada");
        break;
    }
        return kunci;
    }

    public String setKunci(int kunci) {
        this.kunci = kunci;
        if(kunci==1){
            return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }
       
    }

    public int getKeamanan() {
        switch(keamanan){
            case 1: System.out.println("Keamanan = Aman");
                break;
            case 2: System.out.println("Keamanan = Tidak Aman");
                break;}
        return keamanan;
    }

    public String setKeamanan(int keamanan) {
        this.keamanan = keamanan;
        if(keamanan==1){
              return "Sesuai";  
        }
        else{
            return "Tidak Sesuai";
        }
    }
    
 abstract void Keamanan();
 abstract void Kuncipintujendela();
 abstract void Kekokohan();
 abstract void OutputKeamanan();

    
    
}

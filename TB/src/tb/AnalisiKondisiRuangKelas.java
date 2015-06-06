
package tb;

import java.util.Scanner;
abstract public class AnalisiKondisiRuangKelas  {
    private int panjang;
    private int lebar;
    private int luas;
    private int jumlahkursi;
    private int rasio;
    private int pintu;
    private int jendela;
    Scanner scan=new Scanner(System.in);

    public AnalisiKondisiRuangKelas(int panjang, int lebar, int luas, int jumlahkursi, int rasio, int pintu, int jendela) {
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
        System.out.print("Luas="+luas);
        if(getPanjang()==getLebar()) {
            System.out.println("/Bentuk Ruang Persegi");
        }
        else
            if(getPanjang()!=getLebar())
        {   System.out.println("/Bentuk Ruang Persegi Panjang");
        
    }   return luas;
}

    

    public int getJumlahkursi() {
        return jumlahkursi;
    }

    public void setJumlahkursi(int jumlahkursi) {
        this.jumlahkursi = jumlahkursi;
    }

    public int getRasio() {
        rasio=luas/getJumlahkursi();
        System.out.print("Rasio:"+rasio);
                if(rasio >= 0.5){
                    System.out.println("/Sesuai");
                }
                else
                    System.out.println("/Tidak Sesuai");
        return rasio;
        
    }


        
    

    public int getPintu() {
        if(pintu>=2 ){
            System.out.println("Pintu="+pintu+" Sesuai"); 
            
        }
        else {
            System.out.println("Pintu="+pintu+" Tidak Sesuai");
        }
        return pintu;
    }

    public String setPintu(int pintu) {
        this.pintu = pintu;
        if(pintu>=2 ){
            return "Sesuai";
            
        }
        else {
            return "Tidak Sesuai";
    }
    }

    public int getJendela() {
        if(jendela>=2 ){
            System.out.println("Jendela:"+jendela+":Sesuai"); 
            
        }
        else {
            System.out.println("Jendela:"+jendela+":Tidak Sesuai");
        }
        
        return jendela;
    }

    public String setJendela(int jendela) {
        this.jendela = jendela;
        if(jendela >=1){
            return "Sesuai";
            
        }
        else {
            return "Tidak Sesuai";
    }
        
    }
    
    abstract void Luas();
    abstract void Rasio();
    abstract void PintuJendela();
    abstract void OutputRuangKelas();
    
    
}
/*

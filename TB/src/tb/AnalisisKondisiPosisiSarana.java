/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools  Template
 * and open the template in the editor.
 */
package finaltb;

import java.util.Scanner;


abstract class AnalisisKondisiPosisiSarana {
    Scanner scan=new Scanner(System.in);
    private int steker;
    private String kondisisteker;
    private String posisisteker;
    private int lcd;
    private String kondisilcd;
    private String posisilcd;
    private int lampu;
    private String kondisilampu;
    private String posisilampu;
    private int kipas;
    private String kondisikipas;
    private String posisikipas;
    private int ac;
    private String kondisiac;
    private String posisiac;
    private String internet;
    private String login;
    private int cctv;
    private String posisicctv;
    private String kondisicctv;

    public AnalisisKondisiPosisiSarana(int steker, String kondisisteker, String posisisteker, int lcd, String kondisilcd, String posisilcd, int lampu, String kondisilampu, String posisilampu, int kipas, String kondisikipas, String posisikipas, int ac, String kondisiac, String posisiac, String internet, String login, String kondisilogin, int cctv, String posisicctv, String kondisicctv) {
        this.steker = steker;
        this.kondisisteker = kondisisteker;
        this.posisisteker = posisisteker;
        this.lcd = lcd;
        this.kondisilcd = kondisilcd;
        this.posisilcd = posisilcd;
        this.lampu = lampu;
        this.kondisilampu = kondisilampu;
        this.posisilampu = posisilampu;
        this.kipas = kipas;
        this.kondisikipas = kondisikipas;
        this.posisikipas = posisikipas;
        this.ac = ac;
        this.kondisiac = kondisiac;
        this.posisiac = posisiac;
        this.internet = internet;
        this.login = login;
        this.cctv = cctv;
        this.posisicctv = posisicctv;
        this.kondisicctv = kondisicctv;
    }

    public String getSteker() {
        System.out.println("Jumlah Steker="+steker);
         if(steker>=4){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
        
    }

    public void setSteker(int steker) {
        this.steker = steker;
       
    }

    public String getKondisisteker() {
        if(kondisisteker.equalsIgnoreCase("Baik")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
        
        
    }

    public void setKondisisteker(String kondisisteker) {
        this.kondisisteker = kondisisteker;
        
    }

    public String getPosisisteker() {
        if(posisisteker.equalsIgnoreCase("Pojok Ruang")||posisisteker.equalsIgnoreCase("Dekat Dosen")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
         
    }

    public void setPosisisteker(String posisisteker) {
        this.posisisteker = posisisteker;
        
    }

    public String getLcd() {
        System.out.println("Jumlah LCD="+lcd);
        if(lcd>1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
       
    }

    public void setLcd(int lcd) {
        this.lcd = lcd;
        
    }

    public String getKondisilcd() {
       if(kondisilcd.equalsIgnoreCase("Baik")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
       
    }

    public void setKondisilcd(String kondisilcd) {
        this.kondisilcd = kondisilcd;
        
    }

    public String getPosisilcd() {
         if(posisilcd.equalsIgnoreCase("Dekat Dosen")){
            return "Sesuai";}
                            return"Tidak Sesuai";                             
                            }
    

    public void setPosisilcd(String posisilcd) {
        this.posisilcd = posisilcd;
       
    }

    public String getLampu() {
        System.out.println("Jumlah Lampu="+lampu);
        if(lampu>18){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
        
    }

    public void setLampu(int lampu) {
        this.lampu = lampu;
        
    }

    public String getKondisilampu() {
        if(kondisilampu.equalsIgnoreCase("Baik")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
        
    }

    public void setKondisilampu(String kondisilampu) {
        this.kondisilampu = kondisilampu;
        
    }

    public String getPosisilampu() {
        if(posisilampu.equalsIgnoreCase("Atap Ruangan")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public void setPosisilampu(String posisilampu) {
        this.posisilampu = posisilampu;
        
    }

    public String getKipas() {
        System.out.println("Jumlah Kipas Angin="+kipas);
        if(kipas>1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
        
    }

    public void setKipas(int kipas) {
        this.kipas = kipas;
        
    }

    public String getKondisikipas() {
         if(kondisikipas.equalsIgnoreCase("Baik")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public void setKondisikipas(String kondisikipas) {
        this.kondisikipas = kondisikipas;
        
    }

    public String getPosisikipas() {
       if(posisikipas.equalsIgnoreCase("Atap Ruangan")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public void setPosisikipas(String posisikipas) {
        this.posisikipas = posisikipas;
        
    }

    public String getAc() {
        System.out.println("Jumlah Ac="+ac);
        if(ac>=1){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
      
    }

    public int setAc(int ac) {
        this.ac = ac;
        return ac;
    }

    public String getKondisiac() {
        if(kondisiac.equalsIgnoreCase("Baik")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public void setKondisiac(String kondisiac) {
        this.kondisiac = kondisiac;
        
    }

    public String getPosisiac() {
        if(posisiac.equalsIgnoreCase("Belakang")||posisiac.equalsIgnoreCase("Samping")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public void setPosisiac(String posisiac) {
        this.posisiac = posisiac;
        
    }

    public String getInternet() {
        System.out.println("SSID ="+internet);
        if(posisiac.equalsIgnoreCase("UMM Hotspot")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
        
       
    }

    public void setInternet(String internet) {
        this.internet = internet;
       
    }

    public String getLogin() {
        if(login.equalsIgnoreCase("Login")){
            return "Berhasil";}
                    else {
                            return"Tidak Berhasil";                             
                            }
       
    }

    public void setLogin(String login) {
        this.login = login;
       
    }


    

    public String getCctv() {
        System.out.println("Jumlah CCTV="+cctv);
        if(cctv>=1){
            return "Sesuai";
        }
        else return "Tidak Sesuai";
    }
                                       
                            
        
    

    public void setCctv(int cctv) {
        this.cctv = cctv;
        
    }

    public String getPosisicctv() {
        if(posisicctv.equalsIgnoreCase("Depan")||posisicctv.equalsIgnoreCase("Belakang")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public void setPosisicctv(String posisicctv) {
        this.posisicctv = posisicctv;
       
    }

    public String getKondisicctv() {
        if(posisicctv.equalsIgnoreCase("Baik")){
            return "Sesuai";}
                    else {
                            return"Tidak Sesuai";                             
                            }
    }

    public void setKondisicctv(String kondisicctv) {
        this.kondisicctv = kondisicctv;
        
    }
    
    abstract void Steker();
    abstract void Lcd();
    abstract void Lampu();
    abstract void Kipas();
    abstract void Ac();
    abstract void Internet();
    abstract void Cctv();
    abstract void OutPosisi();
    
}

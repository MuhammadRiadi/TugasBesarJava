/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hais;

/**
 *
 * @author Predator
 */
public class OutputKondisiPosisiSarana extends AnalisisKondisiPosisiSarana {
    
    void OutputKondisiPosisi(){
        System.out.print("Jumlah Steker="+getSteker());
        switch(super.getKondisisteker()){
            case 1:System.out.print("\tKondisi = Baik");
                break;}
        switch(super.getPosisisteker()){
            case 1:System.out.println("\tPosisi = Pojok Ruang ");
                break;
            case 2:System.out.println("\tPosisi = Dekat Dosen ");}
                
        
        System.out.print("Jumlah LCD="+super.getLcd());
        switch(super.getKondisilcd()){
            case 1:System.out.print("\tKondisi = Baik");
                break;}
        switch(super.getPosisilcd()){
            case 1:System.out.println("\tPosisi = Pojok Ruang ");
                break;
            case 2:System.out.println("\tPosisi = Dekat Dosen ");}
                
        System.out.print("Jumlah Lampu="+super.getLampu());
        switch(super.getKondisilampu()){
            case 1:System.out.print("\tKondisi = Berfungsi");
                break;}
        switch(super.getPosisilampu()){
            case 1:System.out.println("\tPosisi = Atap ");
                break;
            case 2:System.out.println("\tPosisi = Dinding ");}
                
        System.out.print("Jumlah Kipas Angin="+super.getKipas());
        switch(super.getKondisikipas()){
            case 1:System.out.print("\tKondisi = Berfungsi");
                break;}
        switch(super.getPosisisteker()){
            case 1:System.out.println("\tPosisi = Atap Ruangan ");
                break;
            case 2:System.out.println("\tPosisi = Meja Dosen ");}
                
        System.out.print("Jumlah Steker="+super.getAc());
        switch(super.getKondisiac()){
            case 1:System.out.print("\tKondisi = Berfungsi");
                break;}
        switch(super.getPosisiac()){
            case 1:System.out.println("\tPosisi = Pojok Ruang ");
                break;
            case 2:System.out.println("\tPosisi = Dinding ");}
                
        System.out.print("SSID ="+super.getInternet());
        switch(super.getLogin()){
            case 1:System.out.print("\tLogin = Berhasil");
                break;}
            
        System.out.print("Jumlah CCTV="+getCctv());
        switch(super.getKondisicctv()){
            case 1:System.out.print("\tKondisi = Berfungsi");
                break;}
        switch(super.getPosisicctv()){
            case 1:System.out.println("\tPosisi = Depan ");
                break;
            case 2:System.out.println("\tPosisi = Belakang ");
        }
        }
        }
        
                
                
            
        
    
    


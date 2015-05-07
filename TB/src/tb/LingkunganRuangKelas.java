/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riadi;

import java.util.Scanner;
public class LingkunganRuangKelas {
    Scanner scan=new Scanner(System.in);
    private int lantai;
    private int dinding;
    private int atap;
    private int pintu;
    private int jendela;

    public int getLantai() {
        return lantai;
    }

    public void setLantai(int lantai) {
        this.lantai = lantai;
    }

    public int getDinding() {
        return dinding;
    }

    public void setDinding(int dinding) {
        this.dinding = dinding;
    }

    public int getAtap() {
        return atap;
    }

    public void setAtap(int atap) {
        this.atap = atap;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public int getJendela() {
        return jendela;
    }

    public void setJendela(int jendela) {
        this.jendela = jendela;
    }
    
    void Lingkungan(){
        System.out.println("\n\n==LINGKUNGAN RUANG KELAS==\n\n");
        System.out.println("Pilih Kondisi Lantai");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        setLantai(scan.nextInt());
        
        System.out.println("Pilih Kondisi Dinding");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        setDinding(scan.nextInt());
        
        System.out.println("Pilih Kondisi Atap");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        setAtap(scan.nextInt());
        
        System.out.println("Pilih Kondisi Pintu");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        setPintu(scan.nextInt());
        
        System.out.println("Pilih Kondisi Jendela");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        setJendela(scan.nextInt());
        

        
        

        
    }
    
    
    
    
    
}

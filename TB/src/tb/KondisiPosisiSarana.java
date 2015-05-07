/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hais;
import java.util.Scanner;
public class KondisiPosisiSarana {
    Scanner scan=new Scanner(System.in);
    private int steker;
    private int kondisisteker;
    private int posisisteker;
    private int lcd;
    private int kondisilcd;
    private int posisilcd;
    private int lampu;
    private int kondisilampu;
    private int posisilampu;
    private int kipas;
    private int kondisikipas;
    private int posisikipas;
    private int ac;
    private int kondisiac;
    private int posisiac;
    private int internet;
    private int login;
    private int kondisilogin;
    private int cctv;
    private int posisicctv;
    private int kondisicctv;

    public int getSteker() {
        return steker;
    }

    public void setSteker(int steker) {
        this.steker = steker;
    }

    public int getKondisisteker() {
        return kondisisteker;
    }

    public void setKondisisteker(int kondisisteker) {
        this.kondisisteker = kondisisteker;
    }

    public int getPosisisteker() {
        return posisisteker;
    }

    public void setPosisisteker(int posisisteker) {
        this.posisisteker = posisisteker;
    }

    public int getLcd() {
        return lcd;
    }

    public void setLcd(int lcd) {
        this.lcd = lcd;
    }

    public int getKondisilcd() {
        return kondisilcd;
    }

    public void setKondisilcd(int kondisilcd) {
        this.kondisilcd = kondisilcd;
    }

    public int getPosisilcd() {
        return posisilcd;
    }

    public void setPosisilcd(int posisilcd) {
        this.posisilcd = posisilcd;
    }

    public int getLampu() {
        return lampu;
    }

    public void setLampu(int lampu) {
        this.lampu = lampu;
    }

    public int getKondisilampu() {
        return kondisilampu;
    }

    public void setKondisilampu(int kondisilampu) {
        this.kondisilampu = kondisilampu;
    }

    public int getPosisilampu() {
        return posisilampu;
    }

    public void setPosisilampu(int posisilampu) {
        this.posisilampu = posisilampu;
    }

    public int getKipas() {
        return kipas;
    }

    public void setKipas(int kipas) {
        this.kipas = kipas;
    }

    public int getKondisikipas() {
        return kondisikipas;
    }

    public void setKondisikipas(int kondisikipas) {
        this.kondisikipas = kondisikipas;
    }

    public int getPosisikipas() {
        return posisikipas;
    }

    public void setPosisikipas(int posisikipas) {
        this.posisikipas = posisikipas;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    public int getKondisiac() {
        return kondisiac;
    }

    public void setKondisiac(int kondisiac) {
        this.kondisiac = kondisiac;
    }

    public int getPosisiac() {
        return posisiac;
    }

    public void setPosisiac(int posisiac) {
        this.posisiac = posisiac;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getKondisilogin() {
        return kondisilogin;
    }

    public void setKondisilogin(int kondisilogin) {
        this.kondisilogin = kondisilogin;
    }

    public int getCctv() {
        return cctv;
    }

    public void setCctv(int cctv) {
        this.cctv = cctv;
    }

    public int getPosisicctv() {
        return posisicctv;
    }

    public void setPosisicctv(int posisicctv) {
        this.posisicctv = posisicctv;
    }

    public int getKondisicctv() {
        return kondisicctv;
    }

    public void setKondisicctv(int kondisicctv) {
        this.kondisicctv = kondisicctv;
    }
    
    
    
    
     void StopKontak(){
        System.out.println("\n\n==JUMLAH KONDISI DAN POSISI PRASARANA==\n\n");
        System.out.println("Masukkan Jumlah Stop Kontak: ");
        setSteker(scan.nextInt());
        System.out.println("Pilih Kondisi Stop Kontak: ");
        System.out.println("1. Baik\n2.Rusak\nPilih Kondisi [1-2]= ");
        setKondisisteker(scan.nextInt());
        System.out.println("Pilih Posisi Stop Kontak: ");
        System.out.println("1.Pojok Ruang\n2.Dekat Dosen\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisisteker(scan.nextInt());
        
        
    }
    
    void Lcd(){
        System.out.println("Masukkan Jumlah Kabel LCD: ");
        setLcd(scan.nextInt());
        System.out.println("Pilih Kondisi Kabel LCD: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisilcd(scan.nextInt());
        System.out.println("Pilih Posisi LCD: ");
        System.out.println("1.Pojok Ruang\n2.Dekat Dosen\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisilcd(scan.nextInt());
        
        
    }
    
    void Lampu(){
        System.out.println("Masukkan Jumlah Lampu: ");
        setLampu(scan.nextInt());
        System.out.println("Pilih Kondisi Lampu: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisilampu(scan.nextInt());
        System.out.println("Pilih Posisi Lampu: ");
        System.out.println("1.Atap\n2.Dinding\n3.Meja Dosen\nPilih Posisi[1-3]=");
        setPosisilampu(scan.nextInt());
        
        
        
    }
   
    void KipasAngin(){
        System.out.println("Masukkan Jumlah Kipas Angin: ");
        setKipas(scan.nextInt());
        System.out.println("Pilih Kondisi Kipas Angin: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisikipas(scan.nextInt());
        System.out.println("Pilih Posisi Kipas Angin: ");
        System.out.println("1.Atap Ruangan\n2.Meja Dosen\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisikipas(scan.nextInt());
        
        
    }
     
    void Ac(){
        System.out.println("Masukkan Jumlah AC: ");
        setAc(scan.nextInt());
        System.out.println("Pilih Kondisi AC: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisiac(scan.nextInt());
        System.out.println("Pilih Posisi AC: ");
        System.out.println("1.Belakang\n2.Dinding\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisiac(scan.nextInt());
        
        
    }
    
    void Internet(){
        System.out.println("Pilih SSID= ");
        System.out.println("1.UMM Hotspot\n2.UMM Premium\n.3.Lab Informatika\nPilih [1-3]=");
        setInternet(scan.nextInt());
        System.out.println("Login\n1.Berhasil\n2.Tidak");
        setLogin(scan.nextInt());
       
    }
        
    void Cctv(){
        System.out.println("Masukkan Jumlah CCTV: ");
        setCctv(scan.nextInt());
        System.out.println("Pilih Kondisi CCTV: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisicctv(scan.nextInt());
        System.out.println("Pilih Posisi CCTV: ");
        System.out.println("1.Depan\n2.Belakang\n3.Samping\nPilih Posisi[1-3]=");
        setPosisicctv(scan.nextInt());
        
        
        
    }  
    
}

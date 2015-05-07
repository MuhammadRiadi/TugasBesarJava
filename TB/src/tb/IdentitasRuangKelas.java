/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hais;

import java.util.Scanner;


public class IdentitasRuangKelas {
    private String nama;
    private String lokasi;
    private String prodi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

  
      
    public void Identitas(){
        System.out.println("\n\n==IDENTITAS RUANG KELAS==\n\n");
        Scanner scan=new Scanner(System.in);
        System.out.println("Masukkan Nama Anda: ");
        setNama(scan.nextLine());
        System.out.println("Masukkan Lokasi Ruang: ");
        setLokasi(scan.nextLine());
        System.out.println("Masukkan Program Studi: ");
        setProdi(scan.nextLine());
}
    
}

    

    




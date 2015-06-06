/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;
import java.util.Scanner;

abstract public class AnalisisIdentitasRuangKelas {
    private String nama;
    private String lokasi;
    private String prodi;
    Scanner scan=new Scanner(System.in);

    public AnalisisIdentitasRuangKelas(String nama, String lokasi, String prodi) {
        this.nama = nama;
        this.lokasi = lokasi;
        this.prodi = prodi;
    }
    

    public String getNama() {
        System.out.println("Nama: "+nama);
        return nama; 
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
      System.out.println("\nLokasi Ruang: "+lokasi);
      return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getProdi() {
        System.out.println("\nProgram Studi: "+prodi);
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    abstract void Identitas();
    abstract void OutIdentitas();
}

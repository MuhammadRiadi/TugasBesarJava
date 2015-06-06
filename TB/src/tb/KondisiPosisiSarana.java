/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

public class KondisiPosisiSarana extends AnalisisKondisiPosisiSarana {
    

    public KondisiPosisiSarana(int steker, int kondisisteker, int posisisteker, int lcd, int kondisilcd, int posisilcd, int lampu, int kondisilampu, int posisilampu, int kipas, int kondisikipas, int posisikipas, int ac, int kondisiac, int posisiac, int internet, int login, int kondisilogin, int cctv, int posisicctv, int kondisicctv) {
        super(steker, kondisisteker, posisisteker, lcd, kondisilcd, posisilcd, lampu, kondisilampu, posisilampu, kipas, kondisikipas, posisikipas, ac, kondisiac, posisiac, internet, login, kondisilogin, cctv, posisicctv, kondisicctv);
    }
    
    
    
    @Override
     void Steker(){
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
    @Override
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
    @Override
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
   @Override
    void Kipas(){
        System.out.println("Masukkan Jumlah Kipas Angin: ");
        setKipas(scan.nextInt());
        System.out.println("Pilih Kondisi Kipas Angin: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisikipas(scan.nextInt());
        System.out.println("Pilih Posisi Kipas Angin: ");
        System.out.println("1.Atap Ruangan\n2.Meja Dosen\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisikipas(scan.nextInt());
        
        
    }
     @Override
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
    @Override
    void Internet(){
        System.out.println("Pilih SSID ");
        System.out.println("1.UMM Hotspot\n2.UMM Premium\n.3.Lab Informatika\nPilih [1-3]=");
        setInternet(scan.nextInt());
        System.out.println("Login\n1.Berhasil\n2.Tidak");
        setLogin(scan.nextInt());
       
    }
    @Override
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
    @Override
    void OutPosisi(){
       getSteker();getKondisisteker();getPosisisteker();
        getLcd();getKondisilcd();getPosisilcd();
        getLampu();getKondisilampu();getPosisilampu();
        getKipas();getKondisikipas();getPosisikipas();
        getAc();getKondisiac();getPosisiac();
        getInternet();getLogin();
        getCctv();getKondisicctv();getPosisicctv();
      
        
        
    }
    
}

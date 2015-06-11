/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

public class KondisiPosisiSarana extends AnalisisKondisiPosisiSarana {
    

    public KondisiPosisiSarana(int steker, String kondisisteker, String posisisteker, int lcd, String kondisilcd, String posisilcd, int lampu, String kondisilampu, String posisilampu, int kipas, String kondisikipas, String posisikipas, int ac, String kondisiac, String posisiac, String internet, String login, String kondisilogin, int cctv, String posisicctv, String kondisicctv) {
        super(steker, kondisisteker, posisisteker, lcd, kondisilcd, posisilcd, lampu, kondisilampu, posisilampu, kipas, kondisikipas, posisikipas, ac, kondisiac, posisiac, internet, login, kondisilogin, cctv, posisicctv, kondisicctv);
    }
    
    
    
    @Override
     void Steker(){
        System.out.println("\n\n==JUMLAH KONDISI DAN POSISI PRASARANA==\n\n");
        System.out.println("Masukkan Jumlah Stop Kontak: ");
        setSteker(scan.nextInt());
        System.out.println("Pilih Kondisi Stop Kontak: ");
        System.out.println("1. Baik\n2.Rusak\nPilih Kondisi [1-2]= ");
        setKondisisteker(scan.nextLine());
        System.out.println("Pilih Posisi Stop Kontak: ");
        System.out.println("1.Pojok Ruang\n2.Dekat Dosen\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisisteker(scan.nextLine());
        
        
    }
    @Override
    void Lcd(){
        System.out.println("Masukkan Jumlah Kabel LCD: ");
        setLcd(scan.nextInt());
        System.out.println("Pilih Kondisi Kabel LCD: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisilcd(scan.nextLine());
        System.out.println("Pilih Posisi LCD: ");
        System.out.println("1.Pojok Ruang\n2.Dekat Dosen\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisilcd(scan.nextLine());
        
        
    }
    @Override
    void Lampu(){
        System.out.println("Masukkan Jumlah Lampu: ");
        setLampu(scan.nextInt());
        System.out.println("Pilih Kondisi Lampu: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisilampu(scan.nextLine());
        System.out.println("Pilih Posisi Lampu: ");
        System.out.println("1.Atap\n2.Dinding\n3.Meja Dosen\nPilih Posisi[1-3]=");
        setPosisilampu(scan.nextLine());
        
        
        
    }
   @Override
    void Kipas(){
        System.out.println("Masukkan Jumlah Kipas Angin: ");
        setKipas(scan.nextInt());
        System.out.println("Pilih Kondisi Kipas Angin: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisikipas(scan.nextLine());
        System.out.println("Pilih Posisi Kipas Angin: ");
        System.out.println("1.Atap Ruangan\n2.Meja Dosen\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisikipas(scan.nextLine());
        
        
    }
     @Override
    void Ac(){
        System.out.println("Masukkan Jumlah AC: ");
        setAc(scan.nextInt());
        System.out.println("Pilih Kondisi AC: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisiac(scan.nextLine());
        System.out.println("Pilih Posisi AC: ");
        System.out.println("1.Belakang\n2.Dinding\n3.Luar Kelas\nPilih Posisi[1-3]=");
        setPosisiac(scan.nextLine());
        
        
    }
    @Override
    void Internet(){
        System.out.println("Pilih SSID ");
        System.out.println("1.UMM Hotspot\n2.UMM Premium\n.3.Lab Informatika\nPilih [1-3]=");
        setInternet(scan.nextLine());
        System.out.println("Login\n1.Berhasil\n2.Tidak");
        setLogin(scan.nextLine());
       
    }
    @Override
    void Cctv(){
        System.out.println("Masukkan Jumlah CCTV: ");
        setCctv(scan.nextInt());
        System.out.println("Pilih Kondisi CCTV: ");
        System.out.println("1.Berfungsi\n2.Tidak Berfungsi\n[1-2]= ");
        setKondisicctv(scan.nextLine());
        System.out.println("Pilih Posisi CCTV: ");
        System.out.println("1.Depan\n2.Belakang\n3.Samping\nPilih Posisi[1-3]=");
        setPosisicctv(scan.nextLine());
        
        
        
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

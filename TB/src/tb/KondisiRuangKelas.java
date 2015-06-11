 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class KondisiRuangKelas extends AnalisiKondisiRuangKelas {

    public KondisiRuangKelas(int panjang, int lebar, int luas, int jumlahkursi, double rasio, int pintu, int jendela) {
        super(panjang, lebar, luas, jumlahkursi, rasio, pintu, jendela);
    }
    
    @Override
    void Luas(){
        System.out.println("\n\n==KONDISI RUANG KELAS==\n\n");
        
        System.out.println("Masukkan Panjang Kelas: ");
        super.setPanjang(scan.nextInt());
        System.out.println("Masukkan Lebar Kelas: ");
        super.setLebar(scan.nextInt());
        super.getLuas();
        
        }
              

   @Override
    void Rasio(){
         System.out.println("Masukkan Jumlah Kursi: ");
         setJumlahkursi(scan.nextInt());
         super.getRasio();
        
                
    }
    @Override
    void PintuJendela(){
        System.out.println("Masukkan Jumlah Pintu: ");
        super.setPintu(scan.nextInt());
        System.out.println("Masukkan Jumlah Jendela: ");
        super.setJendela(scan.nextInt());
        super.getPintuJendela();
        
                
    }
    @Override
    void OutputRuangKelas(){
    
     try{
            File data=new File("kjhjkkhk.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data,true));
            pr.println("Panjang="+getLuas());
            pr.println("Lebar="+getLebar());
            pr.println("Jumlah Kursi="+getJumlahkursi());
            pr.println("Pintu="+getPintu());
            pr.println("Jendela="+getJendela());
            pr.println("Luas="+getLuas());
            pr.println("Rasio="+getRasio());
            pr.println("Pintu dan Jendela="+getPintuJendela());
            pr.println("Jumlah Kursi="+getJumlahkursi());
            pr.close();
            
            
        }
        catch(Exception l){
            System.out.println("Salah");
        }
  
    }
    
    
       
       
        
        
        
        
    
    
}

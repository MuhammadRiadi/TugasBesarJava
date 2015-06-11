
package finaltb;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class KebersihanRuangKelas extends AnalisisKebersihanRuangKelas {
   

    public KebersihanRuangKelas(String udara, int cahaya, int kelembapan, int suhu) {
        super(udara, cahaya, kelembapan, suhu);
    }
    
    @Override
     void SirkulasiUdara(){
        System.out.println("\n\n==KEBERSIHAN RUANG KELAS==\n\n");
        System.out.println("Masukkan Sirkulasi Udara");
        System.out.println("1.Lancar\n2.Tidak Lancar\nPilih [1-2]");
        super.setUdara(scan.nextLine());
          
        }
        @Override
     void Pencahayaan(){
        System.out.println("Masukkan Nilai Pencahayaan [250-350]");
        super.setCahaya(scan.nextInt());
        
     }
      @Override
     void Kelembapan(){
        System.out.println("Input Kelembapan [70%-80%]=");
        super.setKelembapan(scan.nextInt());
       
     }
        @Override
     void Suhu(){
        System.out.println("Input Suhu [25-35]=");
        super.setSuhu(scan.nextInt());
 }
     @Override
     void OutputKebersihan(){
         
         try{
            File data=new File("kjhjkkhk.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data,true));
            pr.println("Sirkulasi Udara="+getUdara());
            pr.println("Cahaya="+getCahaya());
            pr.println("Suhu="+getSuhu());
            pr.println("Kelembapan="+getKelembapan());
            pr.close();
            
            
        }
        catch(Exception l){
            System.out.println("Salah");
        }
     }
             
    
    
}
        
    

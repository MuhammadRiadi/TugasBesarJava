/*
d]]]]]]]]]]]dddddddd * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;



public class IdentitasRuangKelas extends AnalisisIdentitasRuangKelas {
 

    public IdentitasRuangKelas(String nama, String lokasi, String prodi) {
        super(nama, lokasi, prodi);
    }
  
    @Override  
    void Identitas(){
        System.out.println("\n\n==IDENTITAS RUANG KELAS==\n\n");
        
        System.out.println("Masukkan Nama Anda: ");
        super.setNama(scan.nextLine());
        System.out.println("Masukkan Lokasi Ruang: ");
        super.setLokasi(scan.nextLine());
        System.out.println("Masukkan Program Studi: ");
        super.setProdi(scan.nextLine());
        
}
   
        
     
        @Override
     void OutIdentitas(){
     
         
         
          try{
            File data=new File("kjhjkkhk.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data,true));
            pr.println("NAMA="+getNama());
            pr.println("Lokasi="+getLokasi());
            pr.println("Prodi="+getProdi());
            pr.close();
            
            
        }
        catch(Exception l){
            System.out.println("Salah");
        }
     
     }}
     
     
     
     
    


    

    




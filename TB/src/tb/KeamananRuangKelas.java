/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class KeamananRuangKelas extends AnalisisKeamananRuangKelas {

    public KeamananRuangKelas(String kekokohan, String kunci, String keamanan) {
        super(kekokohan, kunci, keamanan);
    }
   
    @Override
     void Kekokohan(){
        System.out.println("\n\n==KEAMANAN RUANG KELAS==\n\n");
        System.out.println("Apakah Ruang Kelas Kokoh");
        System.out.println("1.Kokoh\n2.Tidak Kokoh\nPilih [1-2]");
        super.setKekokohan(scan.nextLine());
        super.getKekokohan();
    }
    @Override
             
     void Kuncipintujendela(){
        
        
        System.out.println("Apakah Ada Kunci Pintu dan Jendela");
        System.out.println("1.Ada\n2.Tidak Ada\nPilih [1-2]");
        super.setKunci(scan.nextLine());
        super.getKunci();
        
    }
    @Override
     void Keamanan(){
        
        
        System.out.println("Apakah Ruang Kelas Aman");
        System.out.println("1.Aman\n2.Tidak Aman\nPilih [1-2]");
        super.setKeamanan(scan.nextLine());
        super.getKeamanan();
        
        
    }
     @Override
     void OutputKeamanan(){
         try{
            File data=new File("kjhjkkhk.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data,true));
            pr.println("Kunci dan Pintu Jendea="+getKunci());
            pr.println("Keamanan="+getKeamanan());
            pr.println("Kekokohan="+getKekokohan());
            
            pr.close();
            
            
        }
        catch(Exception l){
            System.out.println("Salah");
        }
     }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class LingkunganRuangKelas extends AnalisisLingkunganRuangKelas {

    public LingkunganRuangKelas(String lantai, String dinding, String atap, String pintu, String jendela) {
        super(lantai, dinding, atap, pintu, jendela);
    }

    @Override
    void InputLingkungan(){
        System.out.println("\n\n==LINGKUNGAN RUANG KELAS==\n\n");
        System.out.println("Pilih Kondisi Lantai");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setLantai(scan.nextLine());
        
        System.out.println("Pilih Kondisi Dinding");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setDinding(scan.nextLine());
        
        System.out.println("Pilih Kondisi Atap");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setAtap(scan.nextLine());
        
        System.out.println("Pilih Kondisi Pintu");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setPintu(scan.nextLine());
        
        System.out.println("Pilih Kondisi Jendela");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setJendela(scan.nextLine());
        
       
    }
    
    
    @Override
 void OutputLingkungan(){
     try{
            File data=new File("kjhjkkhk.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data,true));
            pr.println("Lantai="+getLantai());
            pr.println("Dinding="+getDinding());
            pr.println("Atap="+getAtap());
            pr.println("Pintu="+getPintu());
            pr.println("Jendela="+getJendela());
            
            pr.close();
            
            
        }
        catch(Exception l){
            System.out.println("Salah");
        }
     
 }
    
    
    
    
    
}

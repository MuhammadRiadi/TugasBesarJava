/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jack;

/**
 *
 * @author Predator
 */
public class OutputKebersihanRuangKelas extends AnalisisKebersihanRuangKelas {
    public void Outkebersihan(){
        System.out.println("==KEBERSIHAN RUANG KELAS==");
        switch(getUdara()){
            case 1: System.out.println("Siklus Udara = Lancar");
                break;
            case 2: System.out.println("Kebisingan = Tidak Lancar ");
                break;
        }
        
        switch(getCahaya()){
            case 1: System.out.println("Pencahayaan="+getCahaya()+"/Sesuai");
                break;
            case 2: System.out.println("Pencahayaan="+getCahaya()+"/Sesuai");
                break;
        }
        
        switch(getKelembapan()){
            case 1: System.out.println("Kelembapan="+getKelembapan()+"/Sesuai");
                break;
            case 2: System.out.println("Kelembapan="+getKelembapan()+"/Sesuai");
                break;
        }
        
        switch(getSuhu()){
            case 1: System.out.println("Suhu="+getSuhu()+"/Sesuai");
                break;
            case 2: System.out.println("Suhu="+getSuhu()+"/Sesuai");
               break;
                
        
                
                
        
        
        }
    
    }   
}

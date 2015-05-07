/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hais;

/**
 *
 * @author Predator
 */
public class OutputKondisiRuangKelas extends AnalisiKondisiRuangKelas{
    
public void OutRuangan(){
    System.out.println("Panjang="+getPanjang());
    System.out.println("Lebar="+getLebar());
    System.out.println("Jumlah Kursi="+getJumlahkursi());
    System.out.print("Jumlah Jendela="+getJendela());
    System.out.print("| Jumlah Pintu "+getPintu());
    if(getPintu()>=2 && getJendela()>=1){
            System.out.println("Sesuai");
            
        }
        else {
            System.out.println("Tidak Sesuai");
        }
    System.out.print("Luas="+getLuas());
     if(getPanjang()==getLebar()){
            System.out.println("\tBentuk Ruang Persegi");
        }
        else
            if(getPanjang()!=getLebar())
        {System.out.println("\tBentuk Ruang Persegi Panjang");
    
        }
    System.out.print("Rasio="+getRasio());
    setRasio(getLuas()/getJumlahkursi());
                if(getRasio() >= 0.5){
                    System.out.println("\tSesuai");
                }
                else
                    System.out.println("\tTidak Sesuai");
    
    
    
                
    
}
}





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
public class AnalisiKondisiRuangKelas extends KondisiRuangKelas {
    
     @Override
    void Luas() {
        super.Luas(); 
        setLuas(getPanjang()*getLebar());
        
        System.out.println("Luas Kelas= "+getLuas());
        if(getPanjang()==getLebar()){
            System.out.println("Bentuk Ruang Persegi");
        }
        else
            if(getPanjang()!=getLebar())
        {System.out.println("Bentuk Ruang Persegi Panjang");
    }
    }

    @Override
    void Rasio() {
        super.Rasio(); 
         setRasio(getLuas()/getJumlahkursi());
                if(getRasio() >= 0.5){
                    System.out.println("Rasio Sesuai");
                }
                else
                    System.out.println("Rasio Tidak Sesuai");
    }

    @Override
    void pintujendela() {
        super.pintujendela(); //To change body of generated methods, choose Tools | Templates.
    if(getPintu()>=2 && getJendela()>=1){
            System.out.println("Sesuai");
            
        }
        else {
            System.out.println("Tidak Sesuai");
        }
    }
    
    
}

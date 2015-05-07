/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riadi;

/**
 *
 * @author Predator
 */
public class AnalisisLingkunganRuangKelas extends LingkunganRuangKelas {

    @Override
    void Lingkungan() {
        super.Lingkungan();        
        if(getLantai()==1||getDinding()==1||getAtap()==1||getPintu()==1||getJendela()==1){
            System.out.println("Bersih");
        }
        else{
            System.out.println("Kurang Bersih"); 
    }
    }
    
    
}

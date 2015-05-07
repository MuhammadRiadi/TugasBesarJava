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
public class AnalisisKeamananRuangKelas extends KeamananRuangKelas {

    @Override
    void Kekokohan() {
        super.Kekokohan(); 
        if(getKekokohan()==1){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }
    }

    @Override
    void Kuncipintujendela() {
        super.Kuncipintujendela(); //To change body of generated methods, choose Tools | Templates.
        if(getKunci()==1){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }
    }

    @Override
     void Keamanan() {
        super.Keamanan(); //To change body of generated methods, choose Tools | Templates.
    if(getKeamanan()==1){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }
    }
    
    
}

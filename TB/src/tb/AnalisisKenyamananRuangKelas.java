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
public class AnalisisKenyamananRuangKelas extends KenyamananRuangKelas {

    @Override
    public void Bising() {
        super.Bising();
        if(getBising()==1){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
            
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bau() {
        super.bau();
        if(getBau()==2){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Kebocoran() {
        super.Kebocoran();
        if(getKebocoran()==2){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Kerusakan() {
        super.Kerusakan();
        if(getKerusakan()==2){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Keausan() {
        super.Keausan(); 
        if(getKeausan()==2){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        }//To change body of generated methods, choose Tools | Templates.
    }
    
            
    
}

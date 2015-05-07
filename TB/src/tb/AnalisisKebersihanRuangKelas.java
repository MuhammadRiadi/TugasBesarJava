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
public class AnalisisKebersihanRuangKelas extends KebersihanRuangKelas {

    @Override
    void SirkulasiUdara() {
        super.SirkulasiUdara();
         if(getUdara()==1){
            System.out.println("Sesuai");  
        }
        else{
            System.out.println("Tidak Sesuai");
        } 
    }

    @Override
    void Pencahayaan() {
        super.Pencahayaan(); 
        if(getCahaya()>=250&&getCahaya()<=350){
            System.out.println("Sesuai");
        }
        else{
            System.out.println("Tidak Sesuai");
    }
    }

    @Override
    void Kelembapan() {
        super.Kelembapan(); 
         if(getKelembapan()>=70&&getKelembapan()<=80){
            System.out.println("Sesuai");
        }
        else
            System.out.println("Tidak Sesuai");
    }

    @Override
    void Suhu() {
        super.Suhu();
        if(getSuhu()>=25&&getSuhu()<=35){
            System.out.println("Sesuai");
        }
        else
            System.out.println("Tidak Sesuai");//To change body of generated methods, choose Tools | Templates.
    }
    
    
}

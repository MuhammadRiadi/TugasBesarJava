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
public class OutputLingkunganRuangKelas extends AnalisisLingkunganRuangKelas {
    public  void OutLingkungan(){
        System.out.println("==LINGKUNGAN RUANG KELAS==");
        
        switch(getLantai()){
            case 1: System.out.println("Lantai = Bersih");
                break;
            case 2: System.out.println("Lantai = Tidak Bersih ");
                break;
            }
        switch(getDinding()){
            case 1: System.out.println("Dinding = Bersih");
                break;
            case 2: System.out.println("Dinding = Tidak Bersih ");
                break;
            }
        switch(getAtap()){
            case 1: System.out.println("Atap = Bersih");
                break;
            case 2: System.out.println("Atap = Tidak Bersih ");
                break;
            }
        switch(getPintu()){
            case 1: System.out.println("Pintu = Bersih");
                break;
            case 2: System.out.println("Pintu = Tidak Bersih ");
                break;
            }
        switch(getJendela()){
            case 1: System.out.println("Jendela = Bersih");
                break;
            case 2: System.out.println("Keausan = Tidak Bersih");
                break;
            }
    }
    
}

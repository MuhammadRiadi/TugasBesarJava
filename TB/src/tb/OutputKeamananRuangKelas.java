/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jack;


public class OutputKeamananRuangKelas extends AnalisisKeamananRuangKelas {
     void OutputKeamanan(){
        System.out.println("==KEAMANAN RUANG KELAS==");
        switch(getKekokohan()){
            case 1: System.out.println("Kekokohan = Kokoh");
                break;
            case 2: System.out.println("Kekokohan = Tidak Kokoh ");
                
        }
        switch(getKunci()){
            case 1: System.out.println("Kunci Pintu dan Jendela = Ada");
                break;
            case 2: System.out.println("Kunci Pintu dan Jendela = Tidak Ada");
        break;
    }
        switch(getKeamanan()){
            case 1: System.out.println("Keamanan = Aman");
                break;
            case 2: System.out.println("Keamanan = Tidak Aman");
                break;
        }   
    }
    
    
}

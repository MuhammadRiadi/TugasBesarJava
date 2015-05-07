/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riadi;


public class OutputKenyamananRuangKelas extends AnalisisKenyamananRuangKelas {
    @Override
    public void OutKenyamanan(){
        System.out.println("==KENYAMANAN RUANG KELAS==");
        switch(getBising()){
            case 1: System.out.println("Kebisingan = Iya");
                break;
            case 2: System.out.println("Kebisingan = Tidak ");
                
        }
        switch(getBau()){
            case 1: System.out.println("Bau = Iya");
                break;
            case 2: System.out.println("Bau = Tidak ");
        break;
    }
        switch(getKebocoran()){
            case 1: System.out.println("Kebocoran = Iya");
                break;
            case 2: System.out.println("Kebocoran = Tidak ");
                break;
        }   
        switch(getKerusakan()){
            case 1: System.out.println("Kerusakan = Iya");
                break;
            case 2: System.out.println("Kerusakan= Tidak ");
                break;
    }
            switch(getKeausan()){
            case 1: System.out.println("Keausan = Iya");
                break;
            case 2: System.out.println("Keausan = Tidak ");
                break;
            }
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;


public class LingkunganRuangKelas extends AnalisisLingkunganRuangKelas {

    public LingkunganRuangKelas(int lantai, int dinding, int atap, int pintu, int jendela) {
        super(lantai, dinding, atap, pintu, jendela);
    }

    @Override
    void InputLingkungan(){
        System.out.println("\n\n==LINGKUNGAN RUANG KELAS==\n\n");
        System.out.println("Pilih Kondisi Lantai");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setLantai(scan.nextInt());
        
        System.out.println("Pilih Kondisi Dinding");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setDinding(scan.nextInt());
        
        System.out.println("Pilih Kondisi Atap");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setAtap(scan.nextInt());
        
        System.out.println("Pilih Kondisi Pintu");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setPintu(scan.nextInt());
        
        System.out.println("Pilih Kondisi Jendela");
        System.out.println("1.Bersih\n2.Tidak Bersih\nPilih [1-2]= ");
        super.setJendela(scan.nextInt());
        
       
    }
    
    
    @Override
 void OutputLingkungan(){
     super.getLantai();
     super.getDinding();
     super.getAtap();
     super.getPintu();
     super.getJendela();
     
 }
    
    
    
    
    
}

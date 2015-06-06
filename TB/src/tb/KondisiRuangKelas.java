 /*

 */
package finaltb;


public class KondisiRuangKelas extends AnalisiKondisiRuangKelas {

    public KondisiRuangKelas(int panjang, int lebar, int luas, int jumlahkursi, int rasio, int pintu, int jendela) {
        super(panjang, lebar, luas, jumlahkursi, rasio, pintu, jendela);
    }
    
    @Override
    void Luas(){
        System.out.println("\n\n==KONDISI RUANG KELAS==\n\n");
        
        System.out.println("Masukkan Panjang Kelas: ");
        super.setPanjang(scan.nextInt());
        System.out.println("Masukkan Lebar Kelas: ");
        super.setLebar(scan.nextInt());
        super.getLuas();
        
        }
              

   @Override
    void Rasio(){
         System.out.println("Masukkan Jumlah Kursi: ");
         setJumlahkursi(scan.nextInt());
         super.getRasio();
        
                
    }
    @Override
    void PintuJendela(){
        System.out.println("Masukkan Jumlah Pintu: ");
        super.setPintu(scan.nextInt());
        System.out.println("Masukkan Jumlah Jendela: ");
        super.setJendela(scan.nextInt());
        
                
    }
    @Override
    void OutputRuangKelas(){
    System.out.println("Panjang="+getPanjang());
    System.out.println("Lebar="+getLebar());
    System.out.println("Jumlah Kursi="+getJumlahkursi());
    super.getJendela();
    super.getPintu();
    super.getLuas();
    super.getRasio();
  
    }
    
    
       
       
        
        
        
        
    
    
}

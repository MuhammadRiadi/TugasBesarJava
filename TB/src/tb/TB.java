/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tb;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltb;
import java.io.*;
/**
 *
 * @author Muhammad Riadi
 */
public class FinalTB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        KondisiPosisiSarana c=new KondisiPosisiSarana(1,1,1,1 ,1,1, 1,1,1, 1,1,1,1,1,1,1,1,1,1,1,1);
        LingkunganRuangKelas d=new LingkunganRuangKelas(1, 1, 1, 1, 1);
        KebersihanRuangKelas f = new KebersihanRuangKelas(1, 1, 1, 1);
        KenyamananRuangKelas g=new KenyamananRuangKelas(1, 1, 1, 1, 1);
        LingkunganRuangKelas e=new LingkunganRuangKelas(1, 1, 1, 1, 1);
        IdentitasRuangKelas a=new IdentitasRuangKelas(null, null, null);
        KondisiRuangKelas b= new KondisiRuangKelas(1, 1,1,1,1, 1, 1);
        KeamananRuangKelas h= new KeamananRuangKelas(1, 1, 1);
                
                
      a.Identitas();
       b.Luas();b.Rasio();b.PintuJendela();
        c.Steker();
        c.Lcd();
        c.Lampu();
        c.Kipas();
        c.Ac();
        c.Internet();
        c.Cctv();
        e.InputLingkungan();
        f.SirkulasiUdara();
        f.Suhu();
        f.Kelembapan();
        f.Pencahayaan();
        g.Bau();
        g.Bising();
        g.Keausan();
        g.Kebocoran();
        g.Kerusakan();
        g.OutKenyamanan();
        h.Keamanan();h.Kekokohan();h.Kuncipintujendela();
          
        try{
            File data=new File("kjhjkkhk.txt");
            PrintWriter pr = new PrintWriter(new FileWriter(data,false));
            pr.println(a.getNama());pr.println(a.getLokasi());pr.println(a.getProdi());
            pr.println(b.getPanjang());pr.println(b.getLebar());pr.println(b.getLuas());pr.println(b.getJumlahkursi());pr.println(b.getRasio());pr.println(b.getPintu());pr.println(b.getJendela());
            pr.println(c.getSteker());pr.println(c.getKondisisteker());pr.println(c.getPosisisteker());
            pr.println(c.getLcd());pr.println(c.getKondisilcd());pr.println(c.getPosisilcd());
            pr.println(c.getLampu());pr.println(c.getKondisilampu());pr.println(c.getPosisilampu());
            pr.println(c.getKipas());pr.println(c.getKondisikipas());pr.println(c.getPosisikipas());
            pr.println(c.getAc());pr.println(c.getKondisiac());pr.println(c.getPosisiac());
            pr.println(c.getInternet());pr.println(c.getLogin());
            pr.println(c.getCctv());pr.println(c.getKondisicctv());pr.println(c.getPosisicctv());
            pr.println(d.getLantai());pr.println(d.getAtap());pr.println(d.getDinding());pr.println(d.getJendela());pr.println(d.getPintu());
            pr.println(f.getSuhu());pr.println(f.getCahaya());pr.println(f.getUdara());pr.println(f.getKelembapan());
            pr.println(g.getBau());pr.println(g.getBising());pr.println(g.getKeausan());pr.println(g.getKebocoran());pr.println(g.getKerusakan());
            pr.println(h.getKeamanan());pr.println(h.getKekokohan());pr.println(h.getKunci());
            pr.close();
            
            
        }
        catch(Exception l){
            System.out.println("Salah");
        }
}
}

/**
 *
 * @author Muhammad Riadi
 */
public class TB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

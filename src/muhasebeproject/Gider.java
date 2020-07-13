/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhasebeproject;


import java.util.ArrayList;

/**
 *
 * @author Şeyma
 */
public class Gider {
     public static ArrayList<Gider> urunListesi =new ArrayList();
     public static ArrayList<Bolum> onaylananBolumler = new ArrayList();
     String urun_adi;
     int miktar;
     int fiyat;
     String  birim;
     String birimler[]=new String[10];
     String aciklama;
     int toplamgider;
     String hesapkodu;
     String gidermerkezi;
     String yokkodu;
    void giderhesabı(int miktar,int fiyat){
          this.toplamgider=this.toplamgider=miktar*fiyat;
         //System.out.println(toplamgider);
    }

    public Gider(String urun_adi, String  birim, int miktar, int fiyat) {
        this.urun_adi = urun_adi;
        this.birim = birim;
        this.miktar = miktar;
        this.fiyat = fiyat;
      
    }
    
   

    public Gider(int miktar, int fiyat, String birim) {
        this.miktar = miktar;
        this.fiyat = fiyat;
        this.birim = birim;
    }
      
   

    public Gider() {
    }
    
    
}

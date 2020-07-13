/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhasebeproject;

/**
 *
 * @author Şeyma
 */
public class MuhasebeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gider g= new Gider();
        
        Universite u =new Universite();
        Fakulte f=new Fakulte();
        Fakulte edebiyat= new Fakulte();
        Fakulte muhendislik = new Fakulte();
        Bolum blm= new Bolum();
        Bolum eem= new Bolum();
        Bolum psiko= new Bolum();
        Bolum hukuk= new Bolum();
        
        u.fakulteler.add(edebiyat);
        u.fakulteler.add(muhendislik);
        edebiyat.bolumler.add(psiko);
        muhendislik.bolumler.add(blm);
        muhendislik.bolumler.add(eem);
        
        
        Gider kagit= new Gider(10,10,"kg");
        kagit.giderhesabı(10, 10);
        blm.giderler.add(kagit);
        System.out.println("kagit totali"+kagit.toplamgider);
        
        Gider kalem= new Gider();
       // kalem.giderhesabı(10, 2);
        eem.giderler.add(kalem);
        
        Gider silgi= new Gider();
        //silgi.giderhesabı(10, 2);
        psiko.giderler.add(silgi);
        
        
        //************* BLM TOPLAM GİDER
        int blmtotalgider=0;
        for (int i = 0; i < blm.giderler.size(); i++) {
            blmtotalgider+=blm.giderler.get(i).toplamgider;
        }
        System.out.println("blm total gider "+blmtotalgider);
        
        
        
       int mühtotalgider=0;
        for (int i = 0; i < muhendislik.bolumler.size(); i++) {
            for (int j = 0; j < muhendislik.bolumler.get(i).giderler.size(); j++) {
                mühtotalgider+=muhendislik.bolumler.get(i).giderler.get(j).toplamgider;
            }
            
        }
        System.out.println("total müh gider"+mühtotalgider);
        
      int ünitotalgider=0;
        for (int i = 0; i < u.fakulteler.size(); i++) {
            for (int j = 0; j < u.fakulteler.get(i).bolumler.size(); j++) {
                for (int k = 0; k < u.fakulteler.get(i).bolumler.get(j).giderler.size(); k++) {
                    ünitotalgider+=u.fakulteler.get(i).bolumler.get(j).giderler.get(k).toplamgider;
                }
            }
        }
        System.out.println("total üni gider"+ünitotalgider);
        
        
        
        
        
        
        
        
        
        
        
        
       
       
        
        
        
        
        
        
    }
    
}

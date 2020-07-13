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
public class Fakulte {
    
    String ad;
    int id;
    public  ArrayList<Bolum> bolumler = new ArrayList();
    
    
 /*   void fakulteEkle(Fakulte f){
        for (int i = 0; i < fakulteler.size(); i++) {
            fakulteler.add(f);
        }
    }*/

    
    public Fakulte(String ad,int id) {
        this.ad = ad;
        this.id=id;
    }

    public Fakulte() {
    }

    
    
    
}

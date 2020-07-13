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
public  class Bolum  {
    
    String ad;
    int id;
    public  ArrayList<Gider> giderler= new ArrayList();
    public  ArrayList<Gider> silinengiderler= new ArrayList();

    public Bolum() {
    }

    public Bolum(String ad,int id) {
        this.ad = ad;
        this.id=id;
    }

    
   
   
   
    
}


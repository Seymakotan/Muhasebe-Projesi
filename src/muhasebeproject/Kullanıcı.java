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
public class Kullanıcı {
    int id;
    String department;
    int sifre;
    static ArrayList<Kullanıcı>kullanıcılar=new ArrayList();

    public Kullanıcı(int id, int sifre,String department) {
        this.id = id;
        this.department = department;
        this.sifre=sifre;
    }

    public Kullanıcı() {
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muhasebeproject;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import static muhasebeproject.AnaEkran.fakulte_box;
import static muhasebeproject.AnaEkran.uruncombobox;

/**
 *
 * @author Şeyma
 */
public class Giris extends javax.swing.JFrame {

    /**
     * Creates new form Giris
     */
    public static Kullanıcı girisKullanıcı = new Kullanıcı();
    //public static Fakulte fakulteGiris = new Fakulte();

    public Giris() {
        initComponents();

        String[] arr = {"A", "B", "C", "D", "E", "S", "G", "H", "i", "J", "k", "v", "a", "n", "t", "f", "o", "z"};
        Random random = new Random();
        String a = "";
        String b = "";
        for (int i = 0; i < 3; i++) {
            int select = random.nextInt(arr.length);
            int select2 = random.nextInt(arr.length);
            a += arr[select];
            b += arr[select2];
        }
        for (int i = 0; i < 4; i++) {
            Random rnd = new Random();
            a += rnd.nextInt(10) + "";
            b += rnd.nextInt(10) + "";
        }

        jlbl_kullanıcıGuvNo.setText(a);
       // jlbl_bolumGuvNo.setText(b);

        /* try {
            int ID = Integer.parseInt(txt_bolumID.getText());
            String guvenlikNo = jlbl_bolumGuvNo.getText();
//            String sifre = String.copyValueOf(jPasbolumSifre.getPassword());
            boolean girisYap = false;

            for (int j = 0; j < Universite.fakulteler.size(); j++) {
                if (Universite.fakulteler.get(j).id == ID) {
                    if (guvenlikNo.equals(txt_bolumGuvenlikNo.getText())) {
                        fakulteGiris = Universite.fakulteler.get(j);
                        girisYap = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Guvenlik No Yanlis");
                        return;
                    }
                }
            }

            if (girisYap) {
                BolumGiris bolumgiris = new BolumGiris();
                bolumgiris.setVisible(true);
                this.dispose();

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Bolum ID Gecersiz");
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ogretmenGiris = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_kullaniciID = new javax.swing.JTextField();
        txt_kullaniciGuvenlikNo = new javax.swing.JTextField();
        jlbl_kullanıcıGuvNo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_kullaniciGiris = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        btn_ogretmenGiris.setBackground(new java.awt.Color(255, 255, 255));
        btn_ogretmenGiris.setForeground(new java.awt.Color(255, 255, 255));
        btn_ogretmenGiris.setText("Giris");
        btn_ogretmenGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogretmenGirisActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Yönetici ID");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Güvenlik No");

        txt_kullaniciGuvenlikNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kullaniciGuvenlikNoActionPerformed(evt);
            }
        });

        jlbl_kullanıcıGuvNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel9.setText("Kullanıcı ID => 1");

        btn_kullaniciGiris.setText("Giriş");
        btn_kullaniciGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kullaniciGirisActionPerformed(evt);
            }
        });

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(404, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl_kullanıcıGuvNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_kullaniciID)
                    .addComponent(txt_kullaniciGuvenlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kullaniciGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kullaniciID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kullaniciGuvenlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jlbl_kullanıcıGuvNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_kullaniciGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ogretmenGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogretmenGirisActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btn_ogretmenGirisActionPerformed

    private void txt_kullaniciGuvenlikNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kullaniciGuvenlikNoActionPerformed
        // TODO add your handling code here:
        /*
        if (Kullanıcı.kullanıcılar.get(i).id == ID && Kullanıcı.kullanıcılar.get(i).department.equals("Ana")) {
                    if (guvenlikNo.equals(txt_kullaniciGuvenlikNo.getText()) ) {
                        girisKullanıcı = Kullanıcı.kullanıcılar.get(i);
                        girisYap = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Guvenlik No Yanlis");
                        return;
                    }
                }
         */
    }//GEN-LAST:event_txt_kullaniciGuvenlikNoActionPerformed

    private void btn_kullaniciGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kullaniciGirisActionPerformed
        // TODO add your handling code here:
        try {
            int ID = Integer.parseInt(txt_kullaniciID.getText());
            String guvenlikNo = jlbl_kullanıcıGuvNo.getText();
            //  String sifre = String.copyValueOf(jPaskullaniciSifre.getPassword());
            boolean girisYap = false;

            for (int i = 0; i < Kullanıcı.kullanıcılar.size(); i++) {
                if (Kullanıcı.kullanıcılar.get(i).id == ID) {
                    if (guvenlikNo.equals(txt_kullaniciGuvenlikNo.getText())) {
                        //girisKullanıcı = Kullanıcı.kullanıcılar.get(i);
                        girisYap = true;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "Guvenlik No Yanlis");
                        return;
                    }
                }

            }

            if (girisYap) {
                AnaEkran anagiris = new AnaEkran();
                anagiris.setVisible(true);
                //girisKullanıcı = null;

                this.dispose();

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Bolum ID Gecersiz");
        }


    }//GEN-LAST:event_btn_kullaniciGirisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        AnaGiris anag = new AnaGiris();
        anag.setVisible(true);
        //girisKullanıcı = null;

        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_kullaniciGiris;
    private javax.swing.JButton btn_ogretmenGiris;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlbl_kullanıcıGuvNo;
    private javax.swing.JTextField txt_kullaniciGuvenlikNo;
    private javax.swing.JTextField txt_kullaniciID;
    // End of variables declaration//GEN-END:variables
}


package com.bilisimegitim.personel;

import com.bilisimegitim.personel.ekran.GirisEkran;
import javax.swing.JFrame;


public class Calistir {
    
    public static void main(String[] args) {
        
        GirisEkran girisEkran = new GirisEkran();
        girisEkran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        girisEkran.setLocationRelativeTo(null);
        girisEkran.setVisible(true);
        
        
        
    }
    
}

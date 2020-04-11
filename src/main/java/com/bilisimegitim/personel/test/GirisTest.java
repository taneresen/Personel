package com.bilisimegitim.personel.test;

import com.bilisimegitim.personel.dao.GirisDAO;
import com.bilisimegitim.personel.dto.Giris;


public class GirisTest {
    
    public static void main(String[] args) {
        
        Giris grs = new Giris();
        grs.setKullanici("taner");
        grs.setSifre("taner1980");
        
        boolean sonuc = GirisDAO.giriseYetkilimi(grs);
        if (sonuc) {
            System.out.println("Girise Yetkilidir");
            
        } else {
            System.out.println("Girise Yetkili Degildir..!!");
        }
        
        
    }
    
}


package com.bilisimegitim.personel.dao;

import com.bilisimegitim.personel.dto.Giris;
import com.bilisimegitim.personel.vt.VTBaglanti;
import java.sql.*;



public class GirisDAO {
    
    public static boolean giriseYetkilimi(Giris p_giris)
    {
        Connection conn = null;
        try {
            String vtsifre = null;
            conn = VTBaglanti.baglantiAc();
            String sorgu = "select sifre from giris where kullanici = ? ";
            PreparedStatement ps = conn.prepareStatement(sorgu);
            ps.setString(1, p_giris.getKullanici());
            ResultSet rs = ps.executeQuery(); // Butun selectlerde bu kullanilacak
            
            while (rs.next()) 
            {
                vtsifre = rs.getString("sifre");
            }
            rs.close();
            ps.close();
            
            if (p_giris.getSifre().equals(vtsifre)) 
                return true; 
            else
                return false;
           
            
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace();
            return false;
        }
        
        finally
        {
            VTBaglanti.baglantiKapat(conn);
        }
    }
    
}

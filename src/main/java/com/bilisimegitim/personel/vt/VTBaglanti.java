
package com.bilisimegitim.personel.vt;

import java.sql.*;




public class VTBaglanti {
    
    public static Connection baglantiAc()
    {
        
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://192.168.0.238:5432/pbs", "postgres", "postgres");
            
            return conn;
            
            
        }
        catch (Exception ex) {
           ex.printStackTrace();
           return null;
        }
    
    
       
    }
    
    public static void baglantiKapat(Connection p_conn)
    {
        try {
            p_conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    
    }
    
}

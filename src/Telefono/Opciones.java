/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefono;

import Conexion.ConexionBD;
import Login.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tempo
 */
public class Opciones {
    static ConexionBD cc = new ConexionBD();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    
    public static int registrar(Sentencias s){
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try{
            ps = cn.prepareStatement(sql);
            ps.setInt(1, s.getCodigoSocio());
            ps.setString(2, String.valueOf(s.getTipoTel()));
            ps.setString(3, s.getNumero());
            ps.setString(4, String.valueOf(s.getExtension()));
            rsu = ps.executeUpdate();
        }
        catch(SQLException ex){
            System.out.println("Error");
        }
        return rsu;
    }
    
    public static int actualizar(Sentencias s){
        int rsu = 0;
        String sql = Roles.Sentencias.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, s.getTipoTel());
            ps.setString(2, s.getNumero());
            ps.setString(3, s.getExtension());
            ps.setInt(4, s.getCodigoSocio());
            ps.setString(5, s.getNumero());
           
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return rsu;
    }
    
    public static boolean verificaNumero(String numero, int CS, String e, String tTel){
        boolean existe = false;
        String num = "";
        String Ttel = "";
        String E = "";
        
        try {
            String sql = "SELECT * FROM `teléfono` WHERE numero = '" + numero + "' and codigoSocio= " + CS;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                num = rs.getString("numero");
                Ttel = rs.getString("tipoTelefono");
                E = rs.getString("extension");
            }
            
            if(num.equals(numero) && Ttel.equals(tTel) && E.equals(e)){
                existe = true;
            }
        }
        catch(SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return existe;
    }
    
}

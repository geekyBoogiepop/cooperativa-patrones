/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsignarRol;

import Roles.*;
import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import Login.Login;
import java.util.*;

/**
 *
 * @author Rojeru San CL
 */
public class Opciones {

    static ConexionBD cc = new ConexionBD();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;

    public static int registrar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, uc.getCodigo());
            ps.setString(2, uc.getUsuario());
            ps.setInt(3,uc.getCodigoRol());
            ps.setInt(4,uc.getCodigoEmp());
            ps.setString(5,uc.getClave());
            ps.setDate(6, (java.sql.Date) uc.getFechaInicio());
            ps.setDate(7, (java.sql.Date) uc.getFechaFin());
           
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, uc.getCodigo());
            ps.setString(2, uc.getUsuario());
            ps.setInt(3,uc.getCodigoRol());
            ps.setInt(4,uc.getCodigoEmp());
            ps.setString(5,uc.getClave());
            ps.setDate(6, (java.sql.Date) uc.getFechaInicio());
            ps.setDate(7, (java.sql.Date) uc.getFechaFin());
           
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }
    
    
     public static boolean verificaUsuario(String rol) {
        boolean existe = false;
        String user = "";
        try {
            String sql = "SELECT * FROM UsuarioxRol WHERE Usuario = '" + rol + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString(2);
            }

            if (user.equals(rol)) {
                existe = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

   
}

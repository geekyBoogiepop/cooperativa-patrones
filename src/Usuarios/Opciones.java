/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

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
import java.sql.Date;

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
            ps.setString(1, uc.getNombre());
            ps.setString(2, uc.getIdentificacion());
            ps.setString(3, uc.getSexo());
            ps.setString(4, uc.getEstadoCivil());
            ps.setString(5, uc.getProfesion());
            ps.setString(6, uc.getNacionalidad());
            ps.setString(7, uc.getFechaNacimiento().toString());
             ps.setString(8,uc.getFechaIngreso().toString());
             ps.setString(9,uc.getFechaSalida().toString());
            ps.setString(10, uc.getMailInterno());
            ps.setString(11, uc.getMailPersonal());
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
            ps.setString(1, uc.getNombre());
            ps.setString(2, uc.getIdentificacion());
            ps.setString(3, uc.getSexo());
            ps.setString(4, uc.getEstadoCivil());
            ps.setString(5, uc.getProfesion());
            ps.setString(6, uc.getNacionalidad());
            ps.setDate(7, (Date) uc.getFechaNacimiento());
             ps.setDate(8, (Date) uc.getFechaIngreso());
             ps.setDate(9, (Date) uc.getFechaSalida());
            ps.setString(10, uc.getMailInterno());
            ps.setString(11, uc.getMailPersonal());
            ps.setInt(12, uc.getCodigoE());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }


    public static boolean verificaEmpleado(String Empleado) {
        boolean existe = false;
        String user = "";
        try {
            String sql = "SELECT * FROM Empleado WHERE Nombre = '" + Empleado + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString(2);
            }

            if (user.equals(Empleado)) {
                existe = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

   
}

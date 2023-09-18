/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Direccion;

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

    public static int registrar(Sentencias s) {
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, s.getCodigoSocio());
            ps.setString(2, s.getTipoDireccion());
            ps.setString(3, s.getPais());
            ps.setString(4, s.getDepartamento());
            ps.setString(5, s.getCiudad());
            ps.setString(6, s.getBComarca());
            ps.setString(7, s.getDirDomiciliar());
            ps.setString(8, s.getTipoPropiedad());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        return rsu;
    }

    public static boolean verificaNumero(String tipodir, int CS, String pais, String departamento,
            String ciudad, String bcomarca, String dDomiciliar, String tpropiedad) {
        boolean existe = false;
        String Tdir = "";
        String Pais = "";
        String Departamento = "";
        String Ciudad = "";
        String Bcomarca = "";
        String Ddomiciliar = "";
        String Tpropiedad = "";

        try {
            String sql = "SELECT * FROM `dirección` WHERE codigoSocio= " + CS;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Tdir = rs.getString("tipoDireccion");
                Pais = rs.getString("pais");
                Departamento = rs.getString("departamento");
                Ciudad = rs.getString("ciudad");
                Bcomarca = rs.getString("barrioomarca");
                Ddomiciliar = rs.getString("direccionDomiciliar");
                Tpropiedad = rs.getString("tipoPropiedad");

                if (Tdir.equals(tipodir) && Pais.equals(pais) && Departamento.equals(departamento)
                        && Ciudad.equals(ciudad) && Bcomarca.equals(bcomarca) && Ddomiciliar.equals(dDomiciliar)
                        && Tpropiedad.equals(tpropiedad)) {
                    existe = true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        return existe;
    }
}

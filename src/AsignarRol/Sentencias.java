/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsignarRol;

import Roles.*;
import java.util.*;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM UsuarioxRol WHERE Codigo!=1 ORDER BY Codigo";

    public static String REGISTRAR = "INSERT INTO UsuarioxRol(Usuario,CodigoRol,CodigoEmp,Clave,FechaInicio,FechaFin) "
            + "VALUES(?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE UsuarioxRol SET "
            + "Usuario=? ,"
            + "CodigoRol=?, "
            + "CodigoEmp=?,"
            + "Clave=?,"
            + "FechaInicio=?,"
            + "FechaFin=?"
            + "WHERE CodigoRol=?";

   
    private int Codigo;
    private int CodigoRol;
    private int CodigoEmp;
    private String Usuario;
    private String Clave;
    private Date FechaInicio;
    private Date FechaFin;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    
    public int getCodigoRol() {
        return CodigoRol;
    }

    public void setCodigoRol(int CodigoRol) {
        this.CodigoRol = CodigoRol;
    }

    public int getCodigoEmp() {
        return CodigoEmp;
    }

    public void setCodigoEmp(int CodigoEmp) {
        this.CodigoEmp = CodigoEmp;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }
    
    
    
    

   
   

   

}

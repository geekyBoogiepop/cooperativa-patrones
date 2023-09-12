/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.util.Date;


public class Sentencias {

    public static String LISTAR = "SELECT * FROM empleado WHERE codigoE!=1 ORDER BY CodigoE";

    public static String REGISTRAR = "INSERT INTO empleado(Nombre,Identificacion,sexo,estadoCivil,Profesion,Nacionalidad,FechaNacimiento,FechaIngreso,FechaSalida,MailInterno,MailPersonal) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE empleado SET "
            + "Nombre=?, "
            + "Identificacion=?, "
            + "sexo=? ,"
            + "estadoCivil=?,"
            + "Profesion=?,"
            + "Nacionalidad=?,"
            + "FechaNacimiento=?,"
            + "FechaIngreso=?,"
            + "FechaSalida=?,"
            + "MailInterno=?,"
            + "MailPersonal=?"
            + "WHERE CodigoE=?";

  

    private int CodigoE;
    private String Nombre;
    private String Identificacion;
    private String sexo; 
     private String estadoCivil;
    private String Profesion;
    private String Nacionalidad;  
    private Date FechaNacimiento;
    private Date FechaIngreso;
    private Date FechaSalida;
    private String MailInterno;
     private String MailPersonal;

    public int getCodigoE() {
        return CodigoE;
    }

    public void setCodigoE(int CodigoE) {
        this.CodigoE = CodigoE;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getMailInterno() {
        return MailInterno;
    }

    public void setMailInterno(String MailInterno) {
        this.MailInterno = MailInterno;
    }

    public String getMailPersonal() {
        return MailPersonal;
    }

    public void setMailPersonal(String MailPersonal) {
        this.MailPersonal = MailPersonal;
    }
     
     
    
    


}

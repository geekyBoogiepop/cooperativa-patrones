/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Direccion;

/**
 *
 * @author tempo
 */
public class Sentencias {
    
    public static String REGISTRAR = "INSERT INTO `dirección`(codigoSocio, tipoDireccion, pais, departamento, ciudad, barrioComarca, direccionDomiciliar, tipoPropiedad) "
            + "VALUES(?,?,?,?,?,?,?,?)";
    
    public static String ACTUALIZAR = "UPDATE `dirección` SET "
            + "tipoDireccion=?,"
            + "pais=?,"
            + "departamento=?,"
            + "ciudad=?,"
            + "barrioComarca=?,"
            + "direccionDomiciliar=?,"
            + "tipoPropiedad=?"
            + "WHERE CodigoSocio=? and"
            + "direccionDomiciliar=?";
    
    public static String ELIMINAR = "DELETE FROM `dirección` WHERE CodigoSocio = ? and"
            + "direccionDomiciliar=?";
    
    private int CodigoSocio;
    private String TipoD;
    private String Pais;
    private String Dep;
    private String Cid;
    private String Bcomarca;
    private String dDomiciliar;
    private String tPropiedad;
    
    public int getCodigoSocio() {
        return CodigoSocio;
    }

    public void setCodigoSocio(int Codigosocio) {
        this.CodigoSocio = Codigosocio;
    }
    
    public String getTipoDireccion() {
        return this.TipoD;
    }

    public void setTipoDireccion(String tipoD) {
        this.TipoD = tipoD;
    }
    
    public String getPais() {
        return this.Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }
    
    public String getDepartamento() {
        return this.Dep;
    }

    public void setDepartamento(String dep) {
        this.Dep = dep;
    }
    
    public String getCiudad() {
        return this.Cid;
    }

    public void setCiudad(String cid) {
        this.Cid = cid;
    }
    
    public String getBComarca() {
        return this.Bcomarca;
    }

    public void setBComarca(String bComarca) {
        this.Bcomarca = bComarca;
    }
    
    public String getDirDomiciliar() {
        return this.dDomiciliar;
    }

    public void setDirDomiciliar(String Ddomiciliar) {
        this.dDomiciliar = Ddomiciliar;
    }
    
    public String getTipoPropiedad() {
        return this.tPropiedad;
    }

    public void setTipoPropiedad(String Tpropiedad) {
        this.tPropiedad = Tpropiedad;
    }
    
}

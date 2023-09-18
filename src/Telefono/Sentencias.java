/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefono;

/**
 *
 * @author tempo
 */
public class Sentencias {
    
    public static String REGISTRAR = "INSERT INTO `teléfono`(codigoSocio, tipoTelefono, numero, extension) "
            + "VALUES(?,?,?,?)";
    
    public static String ACTUALIZAR = "UPDATE `teléfono` SET "
            + "tipoTelefono=?,"
            + "numero=?,"
            + "extension=?"
            + "WHERE CodigoSocio=? and"
            + "numero=?";
    
    public static String ELIMINAR = "DELETE FROM `teléfono` WHERE CodigoSocio = ? and"
            + "numero=?";
    
    private int CodigoSocio;
    private String TipoTel;
    private String Numero;
    private String Extension;
    
    public int getCodigoSocio() {
        return CodigoSocio;
    }

    public void setCodigoSocio(int Codigosocio) {
        this.CodigoSocio = Codigosocio;
    }
    
    public String getTipoTel() {
        return this.TipoTel;
    }

    public void setTipoTel(String Tipotel) {
        this.TipoTel = Tipotel;
    }
    
    public String getNumero() {
        return this.Numero;
    }

    public void setNumero(String numero) {
        this.Numero = numero;
    }
    
    public String getExtension() {
        return this.Extension;
    }

    public void setExtension(String extension) {
        this.Extension = extension;
    }
    
}

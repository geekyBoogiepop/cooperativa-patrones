/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;


public class Sentencias {

    public static String LISTAR = "SELECT * FROM rol WHERE CodigoRol!=1 ORDER BY CodigoRol";

    public static String REGISTRAR = "INSERT INTO rol(NombreRol) "
            + "VALUES(?)";

    public static String ACTUALIZAR = "UPDATE rol SET "
            + "NombreRol=? "
            + "WHERE CodigoRol=?";

    public static String ELIMINAR = "DELETE FROM rol WHERE CodigoRol = ?";

    private int CodigoRol;
    private String NombreRol;

    public int getCodigoRol() {
        return CodigoRol;
    }

    public void setCodigoRol(int CodigoRol) {
        this.CodigoRol = CodigoRol;
    }

    public String getNombreRol() {
        return NombreRol;
    }

    public void setNombreRol(String NombreRol) {
        this.NombreRol = NombreRol;
    }
   

   

}

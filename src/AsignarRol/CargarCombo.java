/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsignarRol;



import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Latitude
 */
public class CargarCombo {
   

    
    public void consultarRoles(JComboBox cbox_paises) {
 ConexionBD cc = new ConexionBD();
   Connection cn = cc.conexion(); 
    
//Creamos objeto tipo Connection    
        PreparedStatement pst = null;
        ResultSet result = null;

//Creamos la Consulta SQL
        String SSQL = "SELECT * FROM Rol ORDER BY CodigoRol";

//Establecemos bloque try-catch-finally
        try {

            pst = cn.prepareStatement(SSQL);

            result = pst.executeQuery();

            cbox_paises.addItem("Seleccione un Rol");

            while (result.next()) {

                cbox_paises.addItem(result.getString("NombreRol"));

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {

            if (cn != null) {

                try {

                    cn.close();
                    result.close();

                    cn = null;
                    result = null;

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex);

                }

            }

        }
    

} 

    public void consultarEmpleados( JComboBox Empleados){
      ConexionBD cco = new ConexionBD();
    Connection cnn = cco.conexion(); 
    
        PreparedStatement pstl = null;
        ResultSet resulta = null;

        String SSQL = "SELECT * FROM Empleado ORDER BY CodigoE";


        try {

            pstl = cnn.prepareStatement(SSQL);

            resulta = pstl.executeQuery();

            Empleados.addItem("Seleccione un Empleado");

            while (resulta.next()) {

                Empleados.addItem(resulta.getString("Nombre"));

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {

            if (cnn != null) {

                try {

                    cnn.close();
                    resulta.close();

                    cnn = null;
                    resulta = null;

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex);

                }

            }

        }
    }
 

}


package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author David Teran y Christian Chico
 */
public class Conexion {
     Connection connect = null;

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/manejo", "root", "");
           //JOptionPane.showMessageDialog(null, "Feliciontaciones estas conectado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error....." + ex);
        }
        return connect;
    }

}

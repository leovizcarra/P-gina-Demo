package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leo
 */
public class conexionBD {

    public Connection getConexion() {

        String usuario = "root";
        String contra = "Zotw2eaf";
        String url = "jdbc:mysql://localhost:3306/videocentro";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Connection con = DriverManager.getConnection(url, usuario, contra);
            return  con;
        } catch (SQLException e) {
            return null;
        }

    }
}

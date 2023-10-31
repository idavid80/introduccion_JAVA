package programacion.tarea_mayo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author idavid80
 */
public class ConexionDB {

    String usuario;
    String clave;
    String url;

    public ConexionDB(String url, String usuario, String clave) {
        this.url = url;
        this.usuario = usuario;
        this.clave = clave;
    }

    public Connection getConnection() throws SQLException {

            Connection con = DriverManager.getConnection(url, usuario, clave);
            return con;
    }

}

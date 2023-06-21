
package erf.mensajes_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ERF
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection conection = null;
        try{ 
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rwitter","root","laconchadelalora999999");
                if(conection != null){
                    System.out.println("Servidor: conexion OK.");
                }
        } catch(SQLException e) {
            System.out.println("Servidor: " + e );
        }
        return conection;
}
}


package erf.mensajes_app;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ERF
 */
public class MensajesService {
    public static void crearMensaje() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje:");
        String msn = sc.nextLine();
        
        System.out.println("Escribe tu nombre:");
        String name = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(msn);
        registro.setAutor(name);
        MensajesDAO.crearMensajeDB(registro);

    }
    
    public static void listaMensajes(){
        
    }
    
    public static void borrarMensaje(){
        
    }
    
    public static void editarMensaje(){
        
    }
    
}

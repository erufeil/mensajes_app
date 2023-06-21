/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package erf.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author ERF
 */
public class Mensajes_app {

    public static void main(String[] args) {
        System.out.println("Rwitter app v1.0");
        
        Conexion conexionmain = new Conexion();
        try(Connection cnx = conexionmain.get_connection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

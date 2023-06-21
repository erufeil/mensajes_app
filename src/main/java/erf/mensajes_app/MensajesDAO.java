/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erf.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ERF
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje) throws SQLException{
        Conexion db_connect = new Conexion();
        try(Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query="INSERT INTO `rwitter`.`mensaje` (`mensaje`, `autor`, `fecha`) VALUES (?,?,CURRENT_TIMESTAMP);";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutor());
                ps.executeUpdate();
                System.out.println("Servidor: Mensaje creado.");
            }catch(SQLException ex){
                System.out.println("Servidor: " + ex );
            }
        }catch(SQLException e){
            System.out.println("Servidor: " + e);
        }
    }
    
    public static void leerMensajeDB(){
        
    }
    
    public static void borrarMensaje(int id_mensaje){
        
    }
    
    public static void actualizarMensaje(Mensajes mensaje){
        
    }
    
    
}

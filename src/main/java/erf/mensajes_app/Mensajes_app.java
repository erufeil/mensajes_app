/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package erf.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author ERF
 */
public class Mensajes_app {

    public static void main(String[] args) {
        System.out.println("App Rwitter app v1.0");
        System.out.println("Conectando con el servidor...");
        
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        
        do{
            System.out.println("----------------------------");
            System.out.println("-  Aplicacion de Mensajes  -");
            System.out.println("- 1. Crear mensajes        -");
            System.out.println("- 2. Listar mensajes       -");            
            System.out.println("- 3. Editar mensajes       -");
            System.out.println("- 4. Eliminar mensajes     -");
            System.out.println("- 5. Salir                 -");
            System.out.print("- Seleccione una opcion:");
            // leemos la opcion del usuario
            opcion = sc.nextInt();
            System.out.println("----------------------------");
            
            switch (opcion){
                case 1 -> MensajesService.crearMensaje();
                case 2 -> MensajesService.listaMensajes();
                case 3 -> MensajesService.editarMensaje();
                case 4 -> MensajesService.borrarMensaje();
                default -> {
                }
            }
            
            
        }while(opcion !=5);
       
        
        /* no utilizaremos la conexion a la DB
        Conexion conexionmain = new Conexion();
        try(Connection cnx = conexionmain.get_connection()){
        }catch(Exception e){
            System.out.println(e);
        } 
        */
    }
}

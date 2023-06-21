/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erf.mensajes_app;

/**
 *
 * @author ERF
 */
public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autor;
    String fecha_mensaje;

    
    // Constructores
    public Mensajes(){      
    }
    public Mensajes(String mensaje, String autor, String fecha_mensaje) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.fecha_mensaje = fecha_mensaje;
    }
    
    
    //Getters y Setters
    public int getId_mensaje() {  return id_mensaje;  }
    public void setId_mensaje(int id_mensaje) {   this.id_mensaje = id_mensaje; }
    public String getMensaje() {  return mensaje;  }
    public void setMensaje(String mensaje) {   this.mensaje = mensaje;  }
    public String getAutor() {   return autor;  }
    public void setAutor(String autor) {   this.autor = autor;  }
    public String getFecha_mensaje() { return fecha_mensaje;   }
    public void setFecha_mensaje(String fecha_mensaje) { this.fecha_mensaje = fecha_mensaje;   }
    
    
    
    
    
}


package modelo;


public class Usuario {
    
    private int id_usuario;
    private String nombre;

    public Usuario(int id_usuario, String nombre) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

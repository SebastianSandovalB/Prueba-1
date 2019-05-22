package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {

    Conexion con;

    public UsuarioDAO() {
        con = new Conexion();
    }

    public Usuario getUsuarioDAO() {

        Connection accesoBD = con.getConexion();
        Usuario usuario = null;
        try {
            String sql = "SELECT * FROM usuario";
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_usuario = resultados.getInt("id_usuario");
                String nombre = resultados.getString("nombre");

            }
            accesoBD.close();
            return usuario;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener usuario");
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Usuario> getUsuarios() {

        ArrayList<Usuario> usuarios = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {

            String sql = "SELECT * FROM usuario";
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_usuario = resultados.getInt("id_usuario");
                String nombre = resultados.getString("nombre");

                usuarios.add(new Usuario(id_usuario, nombre));
            }
            accesoBD.close();

            return usuarios;

        } catch (Exception e) {

            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }
    public Usuario getUserid(int emisor){
       Connection accesoBD = con.getConexion();
       Usuario usuario = null;
        int id=emisor;
        try {
            String sql = "SELECT * FROM mensaje WHERE id_usr_emisor="+id;
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_usuario = resultados.getInt("id_usuario");
                String nombre = resultados.getString("nombre");

            }
            accesoBD.close();
            return usuario;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener usuario");
            e.printStackTrace();
            return null;
        }
    }
    public void addUsuario(int id, String nombrex){
    Connection accesoBD = con.getConexion();
        Usuario usuario = null;
        try {
            String sql = "INSERT INTO usuario id,nombrex";
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_usuario = resultados.getInt("id_usuario");
                String nombre = resultados.getString("nombre");

            }
            accesoBD.close();

        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al añadir usuario");
            e.printStackTrace();

        }
    
    }

}

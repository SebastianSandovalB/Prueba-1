package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MensajeDAO {

    Conexion con;

    public MensajeDAO() {
        con = new Conexion();
    }

    public Mensaje getMensajeDAO() {

        Connection accesoBD = con.getConexion();
        Mensaje mensaje = null;
        try {
            String sql = "SELECT * FROM mensaje";
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_mensaje = resultados.getInt("id_mensaje");
                String contenido = resultados.getString("contenido");
                int remitente = resultados.getInt("id_usr_receptor");
                int emisor = resultados.getInt("id_usr_emisor");

            }
            accesoBD.close();
            return mensaje;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener mensaje");
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Mensaje> getMensajes() {

        ArrayList<Mensaje> mensajes = new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {

            String sql = "SELECT * FROM mensaje";
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_mensaje = resultados.getInt("id_mensaje");
                int emisor = resultados.getInt("id_usr_emisor");
                int receptor = resultados.getInt("id_usr_receptor");
                String contenido = resultados.getString("contenido");

                UsuarioDAO uDAO = new UsuarioDAO(); //No modificar
                uDAO.getUserid(emisor);
                
                

                mensajes.add(new Mensaje(id_mensaje, uDAO.getUserid(emisor), uDAO.getUserid(receptor), contenido));
            }
            accesoBD.close();

            return mensajes;

        } catch (Exception e) {

            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }

}

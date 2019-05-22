
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.UsuarioDAO;
import vista.BandejaEntrada;
import vista.NuevoMensaje;


public class EnvioController implements ActionListener{
    
     private NuevoMensaje nvomsje;

    public EnvioController(NuevoMensaje nvomsje) {
        this.nvomsje = nvomsje;
    }


   

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Enviar")) {
            UsuarioDAO user = new UsuarioDAO();
            user.addUsuario(id,nombre);


        }

    }
    
    
    
    
    
    
    
    
    
    
}

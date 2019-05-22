package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.BandejaEntrada;
import vista.NuevoMensaje;

public class BandejaController implements ActionListener {

    private BandejaEntrada be;

    public BandejaController(BandejaEntrada be) {
        this.be = be;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Nuevo Mensaje")) {

            NuevoMensaje nm = new NuevoMensaje();
            nm.setVisible(true);

        }

    }
}

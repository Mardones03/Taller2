package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarJugadorSeleccion extends JFrame {
    private JTextArea numeroJugadorTextArea;
    private JTextField textField1;
    private JTextArea nombreJugadorTextArea;
    private JTextField textField2;
    private JTextArea posicionJugadorTextArea;
    private JTextField textField3;
    private VentanaMenu ventanaMenu; // Agregar una referencia a VentanaMenu

    public VentanaAgregarJugadorSeleccion(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu; // Inicializar la referencia a VentanaMenu
        setTitle("Agregar Jugador a Selección");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Utiliza DISPOSE_ON_CLOSE para cerrar solo esta ventana
        setSize(400, 200);
        // Configura la interfaz de usuario para agregar jugadores a la selección aquí

        // Agrega un botón para volver a VentanaMenu
        JButton volverAMenuButton = new JButton("Volver al Menú");
        add(volverAMenuButton);

        volverAMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cierra esta ventana y muestra la ventana VentanaMenu nuevamente
                dispose(); // Cierra esta ventana
                ventanaMenu.setVisible(true); // Muestra VentanaMenu
            }
        });

        setVisible(true);
    }

    public VentanaAgregarJugadorSeleccion() {

    }
}
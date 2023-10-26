package gui;

import controller.SeleccionController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu extends JFrame {
    private JButton agregarSeleccionButton;
    private JButton buscarSeleccionButton;
    private JButton mostrarSeleccionButton;
    private JButton agregarJugadorASeleccionButton;

    public VentanaMenu() {
        setTitle("Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        agregarSeleccionButton = new JButton("Agregar Selección");
        buscarSeleccionButton = new JButton("Buscar Selección");
        mostrarSeleccionButton = new JButton("Mostrar Selección");
        agregarJugadorASeleccionButton = new JButton("Agregar Jugador a Selección");

        add(agregarSeleccionButton);
        add(buscarSeleccionButton);
        add(mostrarSeleccionButton);
        add(agregarJugadorASeleccionButton);

        actionListeners();

        setVisible(true);
    }

    public void actionListeners() {
        agregarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAgregarSeleccion ventanaAgregarSeleccion = new VentanaAgregarSeleccion();
                setVisible(false);
            }
        });

        agregarJugadorASeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaAgregarJugadorSeleccion();
                setVisible(false);
            }
        });

        buscarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaMostrarSeleccion();
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaMenu();
            }
        });
    }
}
package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMostrarSeleccion extends JFrame {
    private VentanaMenu ventanaMenu;

    public VentanaMostrarSeleccion(VentanaMenu ventanaMenu) {
        this.ventanaMenu = ventanaMenu;
        setTitle("Mostrar Selección");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));




        JButton volverAMenuButton = new JButton("Volver al Menú");


        add(volverAMenuButton);

        volverAMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
                ventanaMenu.setVisible(true);
            }
        });

        setVisible(true);
    }
}
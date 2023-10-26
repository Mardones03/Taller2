package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarSeleccion extends JFrame {
    private JTextField idField;
    private JTextField nombrePaisField;
    private JTextField rankingFifaField;
    private VentanaMenu ventanaMenu;

    public VentanaAgregarSeleccion() {
        this.ventanaMenu = ventanaMenu;
        setTitle("Agregar Selección");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));


        idField = new JTextField();
        nombrePaisField = new JTextField();
        rankingFifaField = new JTextField();


        JLabel idLabel = new JLabel("ID de la Selección:");
        JLabel nombrePaisLabel = new JLabel("Nombre del País:");
        JLabel rankingFifaLabel = new JLabel("Ranking FIFA:");


        JButton agregarSeleccionButton = new JButton("Agregar Selección");


        JButton volverAMenuButton = new JButton("Volver al Menú");


        add(idLabel);
        add(idField);
        add(nombrePaisLabel);
        add(nombrePaisField);
        add(rankingFifaLabel);
        add(rankingFifaField);
        add(agregarSeleccionButton);
        add(volverAMenuButton);

        agregarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String id = idField.getText();
                String nombrePais = nombrePaisField.getText();
                int rankingFifa = Integer.parseInt(rankingFifaField.getText());


                dispose();
                ventanaMenu.setVisible(true);
            }
        });

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
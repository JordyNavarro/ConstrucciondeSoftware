package Semana08.practica2;

import java.awt.GridLayout;
import javax.swing.*;

public class RecogeDatos extends JFrame {
    JLabel etiquetaNombre = new JLabel("Nombre: ",SwingConstants.RIGHT);
    JTextField nombre;
    JLabel etiquetaURL = new JLabel("URL: ",SwingConstants.RIGHT);
    JTextField url;
    JLabel etiquetaTipo = new JLabel("Tipo: ",SwingConstants.RIGHT);
    JTextField tipo;

    public RecogeDatos() {
        super("Recogida de información");
        setSize(400, 105);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLookAndFeel();
        String respuesta1 = JOptionPane.showInputDialog(null,
            "Escribe el nombre del sitio:");
        nombre = new JTextField(respuesta1, 20);

        
        String respuesta2 = JOptionPane.showInputDialog(null,
            "Escribe la dirección del sitio:");
        url = new JTextField(respuesta2, 20);

        
        String[] opciones = { "Personal", "Empresarial", "Gubernamental" };
        int respuesta3 = JOptionPane.showOptionDialog(null,
            "¿Qué tipo de sitio es?",
            "Tipo Sitio",
            0,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]);
        tipo = new JTextField(opciones[respuesta3], 20);

        setLayout(new GridLayout(3, 2));
        add(etiquetaNombre);
        add(nombre);
        add(etiquetaURL);
        add(url);
        add(etiquetaTipo);
        add(tipo);
        setLookAndFeel();
        setVisible(true);
    }


    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("No se ha podido usar el sistema "
                + "look and feel: " + e);
        }
    }

    public static void main(String[] arguments) {
        RecogeDatos frame = new RecogeDatos();
    }
}


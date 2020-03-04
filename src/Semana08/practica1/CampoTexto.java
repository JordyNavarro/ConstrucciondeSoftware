package Semana08.practica1;

import javax.swing.*;
import java.awt.*;

public class CampoTexto extends JFrame {
    public CampoTexto() {
        super("CampoTexto");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        JLabel etiquetaPagina = new JLabel("Dirección página web: ",JLabel.RIGHT);
        JTextField direccionPagina = new JTextField("Escribe aquí", 30);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(etiquetaPagina);
        add(direccionPagina);
        setVisible(true);
        
    }

    public static void main(String[] arguments) {
        CampoTexto apli = new CampoTexto();
    }
}
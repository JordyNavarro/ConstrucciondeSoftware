    package Semana08.practica1;

import javax.swing.*;
import java.awt.*;

public class AreaTexto extends JFrame {
    public AreaTexto() {
        super("AreaTexto");
        setSize(500, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea comentarios = new JTextArea(8, 40);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        add(comentarios);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        AreaTexto app = new AreaTexto();
    }
}
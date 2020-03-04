package Semana08.practica1;

import java.awt.*;
import javax.swing.*;

public class MarcoReloj extends JFrame {
    public MarcoReloj() {
        super("Reloj");
        setSize(300, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        PanelReloj tiempo= new PanelReloj();
        add(tiempo);
        setVisible(true);
        
    }

    public static void main(String[] arguments) {
        MarcoReloj reloj = new MarcoReloj();
    }
}
package Semana08.practica1;

 import javax.swing.*;
 import java.awt.*;

 public class Playback extends JFrame {
    public Playback() {
        super("Playback");
        setSize(225, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pausa = new JButton("Pausa");
        add(play);
        add(stop);
        add(pausa);
        setVisible(true);
    }
    public static void main(String[] arguments) {
        Playback pb = new Playback();
    }
}
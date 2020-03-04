package Semana08.practica1;

import javax.swing.*;

 public class CursoVideotutoriales extends JFrame {
    public CursoVideotutoriales() {
        super("Curso Videotutoriales Java");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] arguments) {
        CursoVideotutoriales curso = new CursoVideotutoriales();
    }
}
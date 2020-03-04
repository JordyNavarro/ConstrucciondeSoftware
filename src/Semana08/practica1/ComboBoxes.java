package Semana08.practica1;

import javax.swing.*;
import java.awt.*;

public class ComboBoxes extends JFrame {
    public ComboBoxes() {
        super("Combo Boxes");
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        JComboBox curso = new JComboBox();
        FlowLayout dis = new FlowLayout();
        curso.addItem("Curso de Java");
        curso.addItem("Curso de C++");
        curso.addItem("Curso de PHP");
        curso.addItem("Curso de Flash");
        curso.addItem("Curso de JavaScript");
        curso.addItem("Curso de Java");
        setLayout(dis);
        add(curso);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        ComboBoxes apli = new ComboBoxes();
    }
}
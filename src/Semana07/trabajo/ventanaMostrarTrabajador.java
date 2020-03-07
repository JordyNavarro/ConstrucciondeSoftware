package Semana07.trabajo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author H´P
 */

public class ventanaMostrarTrabajador extends JFrame implements ActionListener{
    public Registro registros=new Registro();
    JPanel panel;
    public JButton btnlistar,btnatras;
    JTextArea txtadatos;

    public ventanaMostrarTrabajador(){
        setSize(300,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel();
        setLocationRelativeTo(this);
        setResizable(false);
    }
    
    void panel(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        inicializar();
    }
    
    void inicializar(){
        btnatras= new JButton("Atras");
        btnatras.setBounds(40, 20, 80, 30);
        btnatras.addActionListener(this);
        panel.add(btnatras);
        
        btnlistar = new JButton("Listar");
        btnlistar.setBounds(180, 20, 80, 30);
        panel.add(btnlistar);
        btnlistar.addActionListener(this);
        
        txtadatos=new JTextArea();
        txtadatos.setBounds(30, 60, 240, 280);
        txtadatos.setEditable(false);
        panel.add(txtadatos);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnatras)){
            
        }
        
        if(e.getSource().equals(btnlistar)){
            txtadatos.setText("");
            txtadatos.setText("Nombres\tApellidos\t  Dni\t Puesto\t Sueldo\n");
            for(Trabajador i: registros.trabajadores){
                txtadatos.append(i.datosTrabajador());
        }
        }
    }
    
    public static void main(String[] args) {
        new ventanaMostrarTrabajador().setVisible(true);
    }
}

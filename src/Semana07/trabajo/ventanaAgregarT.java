package Semana07.trabajo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author H´P
 */
public class ventanaAgregarT extends JFrame implements ActionListener{
    
    ventanaMostrarTrabajador mostrar=new ventanaMostrarTrabajador();
    JPanel panel;
    JLabel lblnombre,lblapellido,lbldni,lblpuesto,lblsueldo;
    JTextField txtnombre,txtapellido,txtdni,txtsueldo;
    JComboBox jcpuesto;
    JButton btnagregar,btnmostrar;
    
    void panel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        inicializar();
    }
    
    public ventanaAgregarT(){
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel();
        setResizable(false);
        setLocationRelativeTo(this);
        
    }
    
    void inicializar(){
        lblnombre=new JLabel("Nombres");
        lblnombre.setBounds(20, 30, 100, 25);
        panel.add(lblnombre);
        lblapellido=new JLabel("Apellidos");
        lblapellido.setBounds(20, 60, 100, 25);
        panel.add(lblapellido);
        lbldni=new JLabel("Dni");
        lbldni.setBounds(20, 90, 100, 25);
        panel.add(lbldni);
        lblpuesto=new JLabel("Puesto");
        lblpuesto.setBounds(20, 120, 100, 25);
        panel.add(lblpuesto);
        lblsueldo=new JLabel("Sueldo");
        lblsueldo.setBounds(20, 150, 100, 25);
        panel.add(lblsueldo); 
        
        txtnombre= new JTextField();
        txtnombre.setBounds(150, 30, 150, 25);
        txtnombre.addActionListener(this);
        panel.add(txtnombre);
        txtapellido= new JTextField();
        txtapellido.setBounds(150, 60, 150, 25);
        txtapellido.addActionListener(this);
        panel.add(txtapellido);
        txtdni= new JTextField();
        txtdni.setBounds(150, 90, 150, 25);
        txtdni.addActionListener(this);
        panel.add(txtdni);
        txtsueldo= new JTextField();
        txtsueldo.setBounds(150, 150, 150, 25);
        txtsueldo.setEditable(false);
        panel.add(txtsueldo);
        
        String items[]={"Gerente","SubGerente","Secretaria","Empleado"};
        jcpuesto=new JComboBox(items);
        jcpuesto.setBounds(150, 120, 150, 25);
        jcpuesto.addActionListener(this);
        panel.add(jcpuesto);
        
        btnagregar=new JButton("Agregar");
        btnagregar.setBounds(150, 200, 80, 30);
        btnagregar.addActionListener(this);
        panel.add(btnagregar);
        btnmostrar=new JButton("Mostrar");
        btnmostrar.setBounds(260, 200, 80, 30);
        btnmostrar.addActionListener(this);
        panel.add(btnmostrar);
        
        mostrar.btnatras.addActionListener(this);
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(jcpuesto)){
            if(jcpuesto.getSelectedIndex()==0){
            txtsueldo.setText("5000");
            }
            if(jcpuesto.getSelectedIndex()==1){
                txtsueldo.setText("4000");
            }
            if(jcpuesto.getSelectedIndex()==2){
                txtsueldo.setText("2500");
            }
            if(jcpuesto.getSelectedIndex()==3){
                txtsueldo.setText("1200");
            }
        }
        if(e.getSource().equals(btnagregar)){
             String nombre=txtnombre.getText();
            String apellido=txtapellido.getText();
            String puesto=jcpuesto.getSelectedItem().toString();
            int dni=Integer.parseInt(txtdni.getText());
            float sueldo=Float.valueOf(txtsueldo.getText());
            mostrar.registros.addTrabajador(new Trabajador(nombre, apellido, dni, puesto, sueldo));
            txtnombre.setText("");
            txtnombre.requestFocus();
            txtapellido.setText("");
            txtapellido.requestFocus();
            txtdni.setText("");
            txtdni.requestFocus();
            txtsueldo.setText("");
            txtsueldo.requestFocus(); 
        }
        
        if(e.getSource().equals(btnmostrar)){
            setVisible(false);
            mostrar.setVisible(true);
        }
        
        if(e.getSource().equals(mostrar.btnatras)){
            setVisible(true);
            mostrar.setVisible(false);
            mostrar.txtadatos.setText("");
        }
    }
    
    public static void main(String[] args) {
        new ventanaAgregarT().setVisible(true);
    }
}

package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FrmRegistraJugador extends JFrame 	{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Variables globales
	JLabel lblTitulo, lblNombre, lblAnno, lblFecha;
	JTextField  txtNombre, txtApellido, txtFecha;
	JButton btnRegistrar;
	
	//Constructor
	public FrmRegistraJugador(){
		setTitle("Registro de Jugador");
		setBounds(10,10,400,350);
		getContentPane().setLayout(null);
		
		lblTitulo = new JLabel("Registro de Jugador");
		lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		lblTitulo.setForeground(Color.RED);
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setOpaque(true);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 15));            
		lblTitulo.setBounds(0, 10, 390, 25);
		getContentPane().add(lblTitulo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30, 80, 120, 25);
		getContentPane().add(lblNombre);		
		
		txtNombre = new JTextField();
		txtNombre.setBounds(200, 80, 120, 25);
		getContentPane().add(txtNombre);

		lblAnno = new JLabel("Apellido");
		lblAnno.setBounds(30, 130, 120, 25);
		getContentPane().add(lblAnno);		
		
		txtApellido = new JTextField();
		txtApellido.setBounds(200, 130, 120, 25);
		getContentPane().add(txtApellido);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(30, 180, 120, 25);
		getContentPane().add(lblFecha);		
		
		txtFecha = new JTextField();
		txtFecha.setBounds(200, 180, 120, 25);
		getContentPane().add(txtFecha);	
	
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setIcon(new ImageIcon(FrmRegistraJugador.class.getResource("/iconos/save.gif")));
		btnRegistrar.setBounds(143,248,120,33);
		getContentPane().add(btnRegistrar);

	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		FrmRegistraJugador frm = new FrmRegistraJugador();
		frm.setVisible(true);
	}


	
	public void mensaje(String ms){
		JOptionPane.showMessageDialog(this, ms);
	}
	

}





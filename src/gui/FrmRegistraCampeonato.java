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

public class FrmRegistraCampeonato extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Variables globales
	JLabel lblTitulo, lblNombre, lblAnno;
	JTextField txtNombre, txtAnno;
	JButton btnRegistrar;

	// Constructor
	public FrmRegistraCampeonato() {
		setTitle("CAMPEONATO");
		setBounds(10, 10, 500, 300);
		getContentPane().setLayout(null);

		lblTitulo = new JLabel("Registro de Campeonato");
		lblTitulo.setHorizontalAlignment(JLabel.CENTER);
		lblTitulo.setForeground(Color.RED);
		lblTitulo.setBackground(Color.WHITE);
		lblTitulo.setOpaque(true);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 15));
		lblTitulo.setBounds(0, 10, 490, 25);
		getContentPane().add(lblTitulo);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(100, 80, 120, 25);
		getContentPane().add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(270, 80, 120, 25);
		getContentPane().add(txtNombre);
  
		lblAnno = new JLabel("Año");
		lblAnno.setBounds(100, 130, 120, 25);
		getContentPane().add(lblAnno);

		txtAnno = new JTextField();
		txtAnno.setBounds(270, 130, 120, 25);
		getContentPane().add(txtAnno);

		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setIcon(new ImageIcon(FrmRegistraCampeonato.class.getResource("/iconos/save.gif")));
		btnRegistrar.setBounds(198, 185, 120, 33);
		getContentPane().add(btnRegistrar);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		FrmRegistraCampeonato frm = new FrmRegistraCampeonato();
		frm.setVisible(true);
	}

	public void mensaje(String ms) {
		JOptionPane.showMessageDialog(this, ms);
	}

	
	
}








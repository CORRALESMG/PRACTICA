package Usuarios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	public static JTextField txt_usuario;
	public static JPasswordField pss_contraseña;

	
	public Usuarios() {
		setTitle("Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(33, 40, 89, 14);
		contentPane.add(lblNewLabel);
		
		txt_usuario = new JTextField();
		txt_usuario.setBounds(98, 75, 86, 20);
		contentPane.add(txt_usuario);
		txt_usuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(33, 119, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		pss_contraseña = new JPasswordField();
		pss_contraseña.setBounds(98, 151, 86, 20);
		contentPane.add(pss_contraseña);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (data.probarPass()== 1)
			}
		});
		btnNewButton.setBounds(63, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(254, 209, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

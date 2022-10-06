package proyecto;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOption {

	private JFrame frmJoption;
	private JLabel lblNewLabel;
	private JButton btnInput;
	private JButton btnMensaje;
	private JButton btnConfirmar;
	private JButton btnBorrar;
	private JLabel lblNewLabel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOption window = new JOption();
					window.frmJoption.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JOption() {
		initialize();
	}

	private void initialize() {
		frmJoption = new JFrame();
		frmJoption.setTitle("JOption");
		frmJoption.setBounds(100, 100, 450, 300);
		frmJoption.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJoption.getContentPane().setLayout(null);
		frmJoption.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/f.JPG")));
		
		btnMensaje = new JButton("Mensaje");
		btnMensaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, "mensage" );
				 JOptionPane.showMessageDialog(null, "mensaje", "tipo de mensaje", 2);
			}
		});
		btnMensaje.setBounds(10, 25, 89, 23);
		frmJoption.getContentPane().add(btnMensaje);
		
		btnInput = new JButton("input");
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String input= JOptionPane.showInputDialog("Introduce algo");
			        System.out.println(""+input);
			        lblNewLabel.setText(input);
			}
		});
		btnInput.setBounds(10, 71, 89, 23);
		frmJoption.getContentPane().add(btnInput);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  int x= JOptionPane.showConfirmDialog(null, "SI O NO?");
			        System.out.println(""+x);
			        if(x==0)lblNewLabel_1.setText("Si");
			        if(x==1)lblNewLabel_1.setText("no");
			        if(x==2)lblNewLabel_1.setText("cancelar");
			}
		});
		btnConfirmar.setBounds(10, 115, 89, 23);
		frmJoption.getContentPane().add(btnConfirmar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(150, 56, 141, 52);
		frmJoption.getContentPane().add(lblNewLabel);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("");
				 lblNewLabel.setText("");
			}
		});
		btnBorrar.setBounds(111, 175, 89, 23);
		frmJoption.getContentPane().add(btnBorrar);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_1.setBounds(150, 119, 138, 45);
		frmJoption.getContentPane().add(lblNewLabel_1);
	}

}

package proyecto;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Area {

	private JFrame frmArea;
	private JTextField textAltura;
	private final JButton btnBorrar = new JButton("Borrar");
	private JTextField textBase;
	private JLabel lblResultado;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area window = new Area();
					window.frmArea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Area() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArea = new JFrame();
		frmArea.setTitle("Area");
		frmArea.setBounds(100, 100, 450, 300);
		frmArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArea.getContentPane().setLayout(null);
		frmArea.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/f.JPG")));
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(38, 11, 93, 40);
		frmArea.getContentPane().add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(38, 62, 93, 40);
		frmArea.getContentPane().add(lblAltura);
		
		textBase = new JTextField();
		textBase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  int b= Integer.parseInt(JOptionPane.showInputDialog("Ingresar Base: "));
			}
		});
		textBase.setBounds(141, 21, 86, 20);
		frmArea.getContentPane().add(textBase);
		textBase.setColumns(10);
		
		textAltura = new JTextField();
		textAltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  int a= Integer.parseInt(JOptionPane.showInputDialog("Ingresar Altura: "));
			}
		});
		textAltura.setColumns(10);
		textAltura.setBounds(141, 72, 86, 20);
		frmArea.getContentPane().add(textAltura);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(38, 126, 71, 14);
		frmArea.getContentPane().add(lblArea);
		
		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(151, 113, 172, 40);
		frmArea.getContentPane().add(lblResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
			           double b=Double.parseDouble(textBase.getText());
			            double a=Double.parseDouble(textAltura.getText());
			            double ar=(b*a)/2;
			            lblResultado.setText("El area es: "+(ar));
			           
			       }catch (Exception e1){
			           JOptionPane.showMessageDialog(null, "ERROR NEL");
			       }
			}
		});
		btnCalcular.setBounds(42, 182, 130, 31);
		frmArea.getContentPane().add(btnCalcular);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 lblResultado.setText("");
				 textBase.setText("");
				 textAltura.setText("");
			}
		});
		btnBorrar.setBounds(230, 182, 120, 31);
		frmArea.getContentPane().add(btnBorrar);
	}
}

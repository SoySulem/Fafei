package proyecto;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frmMen;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	Calculadora ca=new Calculadora();
	Area a=new Area();
	JOption k=new JOption();
	Tablas l=new Tablas();
	CheckBox u=new CheckBox();
	Colores j=new Colores();
	Chicharonera m=new Chicharonera();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menú window = new Menú();
					window.frmMen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menú() {
		initialize();
	}

	private void initialize() {
		frmMen = new JFrame();
		frmMen.setTitle("Menú");
		frmMen.setBounds(100, 100, 338, 279);
		frmMen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMen.getContentPane().setLayout(null);
		frmMen.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/img/f.JPG")));
		
		
		btnNewButton = new JButton("Calculadora");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				ca.frmCalculadora.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 22, 126, 23);
		frmMen.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Area");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.frmArea.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(10, 77, 126, 23);
		frmMen.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("JBotón");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k.frmJoption.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 130, 126, 23);
		frmMen.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Chicharronera");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.frmChicharronera.setVisible(true);
			
			}
		});
		btnNewButton_3.setBounds(98, 186, 126, 23);
		frmMen.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Tablas");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l.frmTablas.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(168, 22, 120, 23);
		frmMen.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("JCheckBox");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u.frmCheckbox.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(168, 77, 120, 23);
		frmMen.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("Colores");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				j.frmColores.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(168, 130, 120, 23);
		frmMen.getContentPane().add(btnNewButton_6);
	}
}
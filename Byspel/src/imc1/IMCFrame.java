package imc1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMCFrame extends JFrame {

	private JPanel contentPane;
	public JTextField txtPeso;
	public JTextField txtEstatura;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		
//		IMC1 imc = new IMC1();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					IMCFrame frame = new IMCFrame(imc);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public IMCFrame(IMC1 imc) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(140, 58, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtEstatura = new JTextField();
		txtEstatura.setColumns(10);
		txtEstatura.setBounds(140, 101, 86, 20);
		contentPane.add(txtEstatura);
		
		JLabel lblNewLabel = new JLabel("Peso:");
		lblNewLabel.setBounds(53, 61, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEstatura = new JLabel("Estatura");
		lblEstatura.setBounds(53, 104, 46, 14);
		contentPane.add(lblEstatura);
		
		JLabel lblKg = new JLabel("Kg");
		lblKg.setBounds(236, 61, 46, 14);
		contentPane.add(lblKg);
		
		JLabel lblMts = new JLabel("Mts");
		lblMts.setBounds(236, 104, 46, 14);
		contentPane.add(lblMts);
		
		JButton btnIMC = new JButton("Calcular IMC");
		btnIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				imc.calcularIMC();	
			}
		});
		btnIMC.setBounds(140, 145, 89, 23);
		contentPane.add(btnIMC);
	}
	
	

}

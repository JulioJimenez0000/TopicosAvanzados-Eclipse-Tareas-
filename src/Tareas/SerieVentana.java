package Tareas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SerieVentana extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtIteraciones;
	private JTextArea txtSerie;

	public static void main(String[] args) {
		
		SerieVentana frame = new SerieVentana();
		frame.setVisible(true);
		
	}

	public SerieVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNewLabel.setBounds(20, 43, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 2:");
		lblNumero.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblNumero.setBounds(20, 68, 69, 14);
		contentPane.add(lblNumero);
		
		JLabel lblIteraciones = new JLabel("Iteraciones:");
		lblIteraciones.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblIteraciones.setBounds(20, 93, 69, 14);
		contentPane.add(lblIteraciones);
		
		JLabel lblVentanaSerie = new JLabel("VENTANA SERIE");
		lblVentanaSerie.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblVentanaSerie.setBounds(171, 11, 96, 14);
		contentPane.add(lblVentanaSerie);
		
		JLabel lblJimenezinc = new JLabel("Jimenez.inc");
		lblJimenezinc.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		lblJimenezinc.setBounds(355, 236, 69, 14);
		contentPane.add(lblJimenezinc);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(84, 41, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setColumns(10);
		txtNumero2.setBounds(84, 68, 86, 20);
		contentPane.add(txtNumero2);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setColumns(10);
		txtIteraciones.setBounds(84, 91, 86, 20);
		contentPane.add(txtIteraciones);
		
		txtSerie = new JTextArea();
		txtSerie.setBounds(20, 149, 313, 81);
		contentPane.add(txtSerie);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String Numero1 = txtNumero1.getText();
				String Numero2 = txtNumero2.getText();
				String Iteraciones = txtIteraciones.getText();
				String Serie = "";
				
				int varNumero1 = Integer.parseInt(Numero1);
				int varNumero2 = Integer.parseInt(Numero2);
				int varIteraciones = Integer.parseInt(Iteraciones);
				int c = 0;
				int Suma= 0;
				
				Serie = Serie + Numero1 + " " + Numero2;
				while(c < varIteraciones){

				    Suma = varNumero1 + varNumero2;
				    				   
				    Serie = Serie + " " + Suma;
				    
				    varNumero1 = varNumero2; 
				    varNumero2 = Suma;
				    c++;

				    }			
					txtSerie.setText(Serie);
					
			}
		});
		btnGenerar.setBounds(290, 40, 89, 23);
		contentPane.add(btnGenerar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(290, 90, 89, 23);
		contentPane.add(btnSalir);
	}
}

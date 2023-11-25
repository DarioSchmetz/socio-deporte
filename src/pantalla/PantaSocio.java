package pantalla;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gestores.Gestor;
import logica.Socio;

import javax.swing.JButton;

public class PantaSocio extends JFrame {

	private JFrame frmBuscarUnSocio;
	private JTextField txtFIngresoNumeroSocio;
	private JTextField txtfNombre;
	private JTextField txtfApellido;
	private JTextField txtFCategoria;
	private JTextField txtfNumeroSocio;
	private JTextField txtFDeporte;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantaSocio window = new PantaSocio();
					window.frmBuscarUnSocio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public PantaSocio() {

		frmBuscarUnSocio = new JFrame();
		frmBuscarUnSocio.setTitle("Buscar un socio");
		frmBuscarUnSocio.setBounds(100, 100, 450, 300);
		frmBuscarUnSocio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBuscarUnSocio.getContentPane().setLayout(null);
		
		JLabel lblSocio = new JLabel("Socio:");
		lblSocio.setBounds(35, 52, 46, 14);
		frmBuscarUnSocio.getContentPane().add(lblSocio);
		
		txtFIngresoNumeroSocio = new JTextField();
		txtFIngresoNumeroSocio.setBounds(159, 52, 86, 20);
		frmBuscarUnSocio.getContentPane().add(txtFIngresoNumeroSocio);
		txtFIngresoNumeroSocio.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(276, 51, 89, 23);
		
		btnBuscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int nroSocio = Integer.valueOf(txtFIngresoNumeroSocio.getText());
				
				try {
					
					Socio socio = Gestor.buscarSocio(nroSocio);
					
					String categoria = Gestor.isVitalicio(nroSocio);
					
					txtfNombre.setText(socio.getNombre());
										
					txtfNumeroSocio.setText(String.valueOf(socio.getNroSocio()));
					
					txtfApellido.setText(socio.getApellido());
					
					txtFCategoria.setText(categoria);
					
					txtFDeporte.setText(socio.getDeporte());
					
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		frmBuscarUnSocio.getContentPane().add(btnBuscar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(35, 90, 114, 14);
		frmBuscarUnSocio.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(35, 148, 114, 14);
		frmBuscarUnSocio.getContentPane().add(lblApellido);
		
		JLabel lblCategoria = new JLabel("Categoria:");
		lblCategoria.setBounds(35, 176, 114, 14);
		frmBuscarUnSocio.getContentPane().add(lblCategoria);
		
		txtfNombre = new JTextField();
		txtfNombre.setEditable(false);
		txtfNombre.setBounds(160, 90, 86, 20);
		frmBuscarUnSocio.getContentPane().add(txtfNombre);
		txtfNombre.setColumns(10);
		
		txtfApellido = new JTextField();
		txtfApellido.setEditable(false);
		txtfApellido.setColumns(10);
		txtfApellido.setBounds(159, 145, 86, 20);
		frmBuscarUnSocio.getContentPane().add(txtfApellido);
		
		txtFCategoria = new JTextField();
		txtFCategoria.setEditable(false);
		txtFCategoria.setColumns(10);
		txtFCategoria.setBounds(159, 173, 86, 20);
		frmBuscarUnSocio.getContentPane().add(txtFCategoria);
		
		JLabel lblNumeroSocio = new JLabel("Numero de socio:");
		lblNumeroSocio.setBounds(35, 120, 114, 14);
		frmBuscarUnSocio.getContentPane().add(lblNumeroSocio);
		
		txtfNumeroSocio = new JTextField();
		txtfNumeroSocio.setEditable(false);
		txtfNumeroSocio.setColumns(10);
		txtfNumeroSocio.setBounds(159, 117, 86, 20);
		frmBuscarUnSocio.getContentPane().add(txtfNumeroSocio);
		
		JLabel lblDeporte = new JLabel("Deporte:");
		lblDeporte.setBounds(35, 207, 114, 14);
		frmBuscarUnSocio.getContentPane().add(lblDeporte);
		
		txtFDeporte = new JTextField();
		txtFDeporte.setEditable(false);
		txtFDeporte.setColumns(10);
		txtFDeporte.setBounds(159, 204, 86, 20);
		frmBuscarUnSocio.getContentPane().add(txtFDeporte);
	}
}
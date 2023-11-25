package pantalla;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class PantaInicio extends JFrame {

	private JFrame frmClubDeportivo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantaInicio window = new PantaInicio();
					window.frmClubDeportivo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	
	public PantaInicio() {
		
		frmClubDeportivo = new JFrame();
		frmClubDeportivo.setTitle("Club deportivo");
		frmClubDeportivo.setBounds(100, 100, 450, 300);
		frmClubDeportivo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClubDeportivo.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		frmClubDeportivo.setJMenuBar(menuBar);
		
		JMenu mnBuscar = new JMenu("Buscar");
		menuBar.add(mnBuscar);
		mnBuscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PantaSocio pSocio = new PantaSocio();
				pSocio.setVisible(true);
				dispose();
			}
		});
		
		JMenu mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		mnSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
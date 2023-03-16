package swingConverter;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import javax.swing.ImageIcon;

public class Converter extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField tfMontoMoneda;
	private JTextField tfResultadoMoneda;
	private JFormattedTextField tfDatoTemperatura;
	private JTextField tfResultadoTemperatura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Converter() {
		setTitle("Conversor de moneda - Challenge ONE Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel pMenu = new JPanel();
		pMenu.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(pMenu, "tMenu");
		pMenu.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONVERSOR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 404, 24);
		pMenu.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 46, 404, 194);
		pMenu.add(panel);
		panel.setLayout(null);
		
		JLabel lblElijaOpcion = new JLabel("Elija una opción:");
		lblElijaOpcion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElijaOpcion.setBounds(10, 11, 179, 17);
		panel.add(lblElijaOpcion);
		
		JButton btnMenuConversorMoneda = new JButton("CONVERSOR DE MONEDAS");
		btnMenuConversorMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(contentPane.getLayout());
				c.show(contentPane, "tMoneda");
			}
		});
		btnMenuConversorMoneda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMenuConversorMoneda.setBounds(77, 62, 250, 23);
		panel.add(btnMenuConversorMoneda);
		
		JButton btnMenuConversorTemperatura = new JButton("CONVERSOR DE TEMPERATURA");
		btnMenuConversorTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(contentPane.getLayout());
				c.show(contentPane, "tTemperatura");
			}
		});
		btnMenuConversorTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMenuConversorTemperatura.setBounds(77, 96, 250, 23);
		panel.add(btnMenuConversorTemperatura);
		
		JPanel pMoneda = new JPanel();
		pMoneda.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(pMoneda, "tMoneda");
		pMoneda.setLayout(null);
		
		JLabel lblTituloMoneda = new JLabel("Conversor de Monedas");
		lblTituloMoneda.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTituloMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloMoneda.setBounds(10, 11, 404, 36);
		pMoneda.add(lblTituloMoneda);
		
		JPanel pMonedaCalculos = new JPanel();
		pMonedaCalculos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pMonedaCalculos.setBackground(new Color(192, 192, 192));
		pMonedaCalculos.setBounds(10, 57, 404, 183);
		pMoneda.add(pMonedaCalculos);
		pMonedaCalculos.setLayout(null);
		
		JComboBox cbDeMoneda = new JComboBox();
		cbDeMoneda.setModel(new DefaultComboBoxModel(new String[] {"GTQ - Quetzales", "USD - Dolares", "EUR - Euro", "GBP - Libra Esterlina", "JPY - Yen Japones", "KRW - Won Surcoreano"}));
		cbDeMoneda.setBounds(10, 29, 176, 22);
		pMonedaCalculos.add(cbDeMoneda);
		
		JComboBox cbParaMoneda = new JComboBox();
		cbParaMoneda.setModel(new DefaultComboBoxModel(new String[] {"GTQ - Quetzales", "USD - Dolares", "EUR - Euro", "GBP - Libra Esterlina", "JPY - Yen Japones", "KRW - Won Surcoreano"}));
		cbParaMoneda.setBounds(218, 29, 176, 22);
		pMonedaCalculos.add(cbParaMoneda);
		
		JLabel lblDeMoneda = new JLabel("De:");
		lblDeMoneda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDeMoneda.setBounds(10, 11, 176, 18);
		pMonedaCalculos.add(lblDeMoneda);
		
		JLabel lblParaMoneda = new JLabel("Para:");
		lblParaMoneda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblParaMoneda.setBounds(218, 11, 176, 18);
		pMonedaCalculos.add(lblParaMoneda);
		
		JLabel lblIngreseDatoMoneda = new JLabel("INGRESE MONTO:");
		lblIngreseDatoMoneda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIngreseDatoMoneda.setBounds(10, 62, 109, 14);
		pMonedaCalculos.add(lblIngreseDatoMoneda);
		
		tfMontoMoneda = new JFormattedTextField(NumberFormat.getNumberInstance());
		tfMontoMoneda.setBounds(117, 62, 277, 20);
		pMonedaCalculos.add(tfMontoMoneda);
		tfMontoMoneda.setColumns(10);
		
		JButton btnCalcularMoneda = new JButton("CALCULAR");
		btnCalcularMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Moneda.tipoCambioM(cbDeMoneda.getSelectedItem().toString(), cbParaMoneda.getSelectedItem().toString());
				double tipoCambio = Moneda.divisa;
				double resultado;
				double datoIngresado;
				datoIngresado = ((Number) tfMontoMoneda.getValue()).doubleValue();
				if(datoIngresado >= 0.0) {
					resultado = datoIngresado * tipoCambio;
					resultado = (double) Math.round(resultado*100d)/100;
					tfResultadoMoneda.setText(Double.toString(resultado));
				}else {
					JOptionPane.showMessageDialog(null, "Ingrese un número positivo!", "No se permite número negativo",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnCalcularMoneda.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcularMoneda.setBounds(10, 94, 99, 23);
		pMonedaCalculos.add(btnCalcularMoneda);
		
		tfResultadoMoneda = new JTextField();
		tfResultadoMoneda.setBounds(117, 96, 277, 20);
		pMonedaCalculos.add(tfResultadoMoneda);
		tfResultadoMoneda.setColumns(10);
		
		JButton btnRegresarMoneda = new JButton("REGRESAR");
		btnRegresarMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(contentPane.getLayout());
				c.show(contentPane, "tMenu");
				tfMontoMoneda.setText("");
				tfResultadoMoneda.setText("");
			}
		});
		btnRegresarMoneda.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegresarMoneda.setBounds(147, 140, 109, 32);
		pMonedaCalculos.add(btnRegresarMoneda);
		
		JPanel pTemperatura = new JPanel();
		pTemperatura.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(pTemperatura, "tTemperatura");
		pTemperatura.setLayout(null);
		
		JLabel lblTituloTemperatura = new JLabel("Conversor de Temperatura");
		lblTituloTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloTemperatura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTituloTemperatura.setBounds(10, 11, 404, 36);
		pTemperatura.add(lblTituloTemperatura);
		
		JPanel pTemperaturaCalculos = new JPanel();
		pTemperaturaCalculos.setLayout(null);
		pTemperaturaCalculos.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pTemperaturaCalculos.setBackground(Color.LIGHT_GRAY);
		pTemperaturaCalculos.setBounds(10, 57, 404, 183);
		pTemperatura.add(pTemperaturaCalculos);
		
		JComboBox cbDeTemperatura = new JComboBox();
		cbDeTemperatura.setModel(new DefaultComboBoxModel(new String[] {"°F - Fahrenheit", "°C - Celsius", "K - Kelvin"}));
		cbDeTemperatura.setBounds(10, 29, 176, 22);
		pTemperaturaCalculos.add(cbDeTemperatura);
		
		JComboBox cbParaTemperatura = new JComboBox();
		cbParaTemperatura.setModel(new DefaultComboBoxModel(new String[] {"°F - Fahrenheit", "°C - Celsius", "K - Kelvin"}));
		cbParaTemperatura.setBounds(218, 29, 176, 22);
		pTemperaturaCalculos.add(cbParaTemperatura);
		
		JLabel lblDeTemperatura = new JLabel("De:");
		lblDeTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDeTemperatura.setBounds(10, 11, 176, 18);
		pTemperaturaCalculos.add(lblDeTemperatura);
		
		JLabel lblParaTemperatura = new JLabel("Para:");
		lblParaTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblParaTemperatura.setBounds(218, 11, 176, 18);
		pTemperaturaCalculos.add(lblParaTemperatura);
		
		JLabel lblIngreseDatoTemperatura = new JLabel("INGRESE DATO:");
		lblIngreseDatoTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIngreseDatoTemperatura.setBounds(10, 62, 109, 14);
		pTemperaturaCalculos.add(lblIngreseDatoTemperatura);
		
		tfDatoTemperatura = new JFormattedTextField(NumberFormat.getNumberInstance());
		tfDatoTemperatura.setColumns(10);
		tfDatoTemperatura.setBounds(117, 62, 277, 20);
		pTemperaturaCalculos.add(tfDatoTemperatura);

		JButton btnCalcularTemperatura = new JButton("CALCULAR");
		btnCalcularTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Temperatura.tipoTemperatura(cbDeTemperatura.getSelectedItem().toString(), cbParaTemperatura.getSelectedItem().toString(), tfDatoTemperatura);
				double cambioTemperatura = Temperatura.convertir;
				cambioTemperatura = (double) Math.round(cambioTemperatura*100d)/100;
				tfResultadoTemperatura.setText(Double.toString(cambioTemperatura));
			}
		});
		btnCalcularTemperatura.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcularTemperatura.setBounds(10, 94, 99, 23);
		pTemperaturaCalculos.add(btnCalcularTemperatura);
		
		tfResultadoTemperatura = new JTextField();
		tfResultadoTemperatura.setColumns(10);
		tfResultadoTemperatura.setBounds(117, 96, 277, 20);
		pTemperaturaCalculos.add(tfResultadoTemperatura);
		
		JButton btnRegresarTemperatura = new JButton("REGRESAR");
		btnRegresarTemperatura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout)(contentPane.getLayout());
				c.show(contentPane, "tMenu");
				tfDatoTemperatura.setText("");
				tfResultadoTemperatura.setText("");
			}
		});
		btnRegresarTemperatura.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRegresarTemperatura.setBounds(147, 140, 109, 32);
		pTemperaturaCalculos.add(btnRegresarTemperatura);
	}
}

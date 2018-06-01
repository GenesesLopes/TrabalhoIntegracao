package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import visao.PainelCirculo;


public class ControleCirculo implements ActionListener {
	PainelCirculo painelCirculo;
	private final double PI = 3.14;
	public ControleCirculo(PainelCirculo painelCirculo) {
		super();
		this.painelCirculo = painelCirculo;
		addEventos();		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == painelCirculo.getBotaoCalcular()) {
			calcular();
		}
		
	}
	private void addEventos() {
		// TODO Auto-generated method stub
		painelCirculo.getBotaoCalcular().addActionListener(this);
	}
	private void calcular() {
		// TODO Auto-generated method stub
		double raio;
		double altura;

		try {
			raio = Float.parseFloat(painelCirculo.getTextRaio().getText());
			altura = Float.parseFloat(painelCirculo.getTextAltura().getText());
			
			painelCirculo.getTextPerimetro().setText(perimetro(raio));
			painelCirculo.getTextArea().setText(area(raio));
			painelCirculo.getTextVolume().setText(volume(raio, altura));
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Não informe letras", "Circulo", JOptionPane.ERROR_MESSAGE);
		}			
			
	}
	private String perimetro(double raio) {
		// TODO Auto-generated method stub
		Double resultado = (2 * PI) * raio;
		DecimalFormat df = new DecimalFormat("0.##");
		String valor = df.format(resultado);
		
		return valor;
	}
	
	private String area(double raio) {
		// TODO Auto-generated method stub
		Double resultado = (raio * raio) * PI;
		DecimalFormat df = new DecimalFormat("0.##");
		String valor = df.format(resultado);
		
		return valor;
	}
	
	private String volume(double raio, double altura) {
		// TODO Auto-generated method stub		

			//double area = Float.parseFloat(area(raio));
			Double resultado = ((raio * raio) * PI) * altura;
			
			DecimalFormat df = new DecimalFormat("0.##");
			String valor = df.format(resultado);
			
			return valor;
		
	
	}
	
}

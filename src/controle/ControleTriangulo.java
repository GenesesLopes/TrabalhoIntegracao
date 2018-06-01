package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import visao.PainelTriangulo;

public class ControleTriangulo implements ActionListener {
	PainelTriangulo painel;
	
	public ControleTriangulo(PainelTriangulo painel) {
		super();
		this.painel = painel;
		addEventos();		
	}

	private void addEventos() {
		// TODO Auto-generated method stub
		painel.getBotaoCalcular().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == painel.getBotaoCalcular()) {
			calcular();
		}
	}

	private void calcular() {
		// TODO Auto-generated method stub
		double aresta;
		
		try {
			aresta = Float.parseFloat(painel.getTextAresta().getText());
			
			painel.getTextPerimetro().setText(perimetro(aresta));
			painel.getTextArea().setText(area(aresta));
			painel.getTextVolume().setText(volume(aresta));
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Não informe letras", "Triângulo", JOptionPane.ERROR_MESSAGE);
		}			
			
	}		

	private String perimetro(double aresta) {
		// TODO Auto-generated method stub
		Double resultado = aresta*3;
		DecimalFormat df = new DecimalFormat("0.##");
		String valor = df.format(resultado);
		
		return valor;
	}
	
	private String area(double aresta) {
		// TODO Auto-generated method stub
		Double resultado = ((Math.pow(aresta, 2)/4)*Math.sqrt(3));
		DecimalFormat df = new DecimalFormat("0.##");
		String valor = df.format(resultado);
		
		return valor;
	}
	
	private String volume(double aresta) {
		// TODO Auto-generated method stub		
		try {
			Double altura = (aresta*Math.sqrt(3))/2;
			Double area = (aresta*altura)/2;
			
			Double resultado = (altura * area)/3;
			
			DecimalFormat df = new DecimalFormat("0.##");
			String valor = df.format(resultado);
			
			return valor;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "0,0";
	}
}

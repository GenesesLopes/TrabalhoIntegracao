package visao;

import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCirculo extends JPanel {

	private JLabel labelRaio;
	private JLabel labelAltura;
	private JLabel labelPerimetro;
	private JLabel labelArea;
	private JLabel labelVolume;
	
	private JTextField textRaio;
	private JTextField textAltura;
	private JTextField textPerimetro;
	private JTextField textArea;
	private JTextField textVolume;
	
	private JButton botaoCalcular;
	
	public PainelCirculo() {
		super();
		this.setLayout(null);
		setBackground(SystemColor.inactiveCaptionBorder);
		
		this.add(getTextRaio());
		this.add(getTextAltura());
		this.add(getTextPerimetro());
		this.add(getTextArea());
		this.add(getTextVolume());
		this.add(getBotaoCalcular());
		
		labelRaio = new JLabel("Raio:");
		labelRaio.setBounds(51, 23, 45, 20);
		this.add(labelRaio);
		
		labelAltura = new JLabel("Altura:");
		labelAltura.setBounds(51, 53, 45, 20);
		this.add(labelAltura);
		
		labelPerimetro = new JLabel("Perimetro:");
		labelPerimetro.setBounds(51, 83, 72, 20);
		this.add(labelPerimetro);
		
		labelArea = new JLabel("Área:");
		labelArea.setBounds(51, 113, 45, 20);
		this.add(labelArea);
		
		labelVolume = new JLabel("Volume:");
		labelVolume.setBounds(51, 143, 52, 24);
		this.add(labelVolume);
	}
	
	public JTextField getTextRaio() {
		if(textRaio== null) {
			textRaio = new JTextField();
			textRaio.setBounds(133, 23, 50, 20);
		}
		return textRaio;
	}
	public JTextField getTextAltura() {
		if(textAltura== null) {
			textAltura = new JTextField();
			textAltura.setBounds(133, 53, 50, 20);
		}
		return textAltura;
	}

	public JTextField getTextPerimetro() {
		if(textPerimetro == null) {
			textPerimetro = new JTextField();
			textPerimetro.setBackground(Color.WHITE);
			textPerimetro.setEditable(false);
			textPerimetro.setBounds(133, 83, 50, 20);
		}
		return textPerimetro;
	}

	public JTextField getTextArea() {
		if(textArea == null) {
			textArea = new JTextField();
			textArea.setBackground(Color.WHITE);
			textArea.setEditable(false);
			textArea.setBounds(133, 113, 50, 20);
		}
		return textArea;
	}

	public JTextField getTextVolume() {
		if(textVolume == null) {
			textVolume = new JTextField();
			textVolume.setBackground(Color.WHITE);
			textVolume.setEditable(false);
			textVolume.setBounds(133, 143, 50, 20);
		}
		return textVolume;
	}

	public JButton getBotaoCalcular() {
		if(botaoCalcular == null) {
			botaoCalcular = new JButton("Calcular");
			botaoCalcular.setBounds(87, 174, 96, 20);
		}
		return botaoCalcular;
	}
	

}

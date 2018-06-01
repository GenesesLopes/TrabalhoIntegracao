package visao;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;

public class PainelTriangulo extends JPanel{
	private JLabel labelAresta;
	private JLabel labelPerimetro;
	private JLabel labelArea;
	private JLabel labelVolume;
	
	private JTextField textAresta;
	private JTextField textPerimetro;
	private JTextField textArea;
	private JTextField textVolume;
	
	private JButton botaoCalcular;
	
	public PainelTriangulo() {
		super();
		this.setLayout(null);
		setBackground(SystemColor.inactiveCaptionBorder);
		
		this.add(getTextAresta());
		this.add(getTextPerimetro());
		this.add(getTextArea());
		this.add(getTextVolume());
		this.add(getBotaoCalcular());
		
		labelAresta = new JLabel("Aresta:");
		labelAresta.setBounds(51, 23, 45, 20);
		this.add(labelAresta);
		
		labelPerimetro = new JLabel("Perimetro:");
		labelPerimetro.setBounds(51, 53, 72, 20);
		this.add(labelPerimetro);
		
		labelArea = new JLabel("Área:");
		labelArea.setBounds(51, 83, 45, 20);
		this.add(labelArea);
		
		labelVolume = new JLabel("Volume:");
		labelVolume.setBounds(51, 113, 52, 24);
		this.add(labelVolume);
	}

	public JTextField getTextAresta() {
		if(textAresta == null) {
			textAresta = new JTextField();
			textAresta.setBounds(133, 23, 50, 20);
		}
		return textAresta;
	}

	public JTextField getTextPerimetro() {
		if(textPerimetro == null) {
			textPerimetro = new JTextField();
			textPerimetro.setBackground(Color.WHITE);
			textPerimetro.setEditable(false);
			textPerimetro.setBounds(133, 53, 50, 20);
		}
		return textPerimetro;
	}

	public JTextField getTextArea() {
		if(textArea == null) {
			textArea = new JTextField();
			textArea.setBackground(Color.WHITE);
			textArea.setEditable(false);
			textArea.setBounds(133, 83, 50, 20);
		}
		return textArea;
	}

	public JTextField getTextVolume() {
		if(textVolume == null) {
			textVolume = new JTextField();
			textVolume.setBackground(Color.WHITE);
			textVolume.setEditable(false);
			textVolume.setBounds(133, 113, 50, 20);
		}
		return textVolume;
	}

	public JButton getBotaoCalcular() {
		if(botaoCalcular == null) {
			botaoCalcular = new JButton("Calcular");
			botaoCalcular.setBounds(87, 144, 96, 20);
		}
		return botaoCalcular;
	}
	
}

package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Quadrado;
import visao.PainelQuadrado;

public class ControladorQuadrado implements ActionListener {
	
	PainelQuadrado painelQuadrado;
	Quadrado quadrado;
	
	public ControladorQuadrado(PainelQuadrado painelQuadrado) {
		this.painelQuadrado = painelQuadrado;
		painelQuadrado.repaint();
		painelQuadrado.validate();
		painelQuadrado.getBotaoCalcular().addActionListener(this);
		painelQuadrado.getBotaoLimpar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			
		if(e.getSource() == painelQuadrado.getBotaoCalcular()) {
			try {
				if(Double.valueOf(painelQuadrado.getValorLado()) < 0) {
					JOptionPane.showMessageDialog(painelQuadrado, "Valor Não permitido");
					painelQuadrado.setLabelValorArea("");
					painelQuadrado.setLabelVolume("");
					painelQuadrado.setValorLado("");
					
				}else {
					quadrado = new Quadrado();
					
					quadrado.setLado(Double.valueOf(painelQuadrado.getValorLado()));
					/* Formula de �?rea: A = L²
					 * Formula de Volume V = L³
					 * */
					//Area
					quadrado.setArea(Math.pow(quadrado.getLado(), 2));
					//Volume
					quadrado.setVolume(Math.pow(quadrado.getLado(), 3));
					//setando no painel
					painelQuadrado.setLabelValorArea(String.valueOf(quadrado.getArea()));
					painelQuadrado.setLabelVolume(String.valueOf(quadrado.getVolume()));
					
				}
			}catch(NumberFormatException ex ) {
				JOptionPane.showMessageDialog(painelQuadrado, "Não é permitido a entrada de caracteres ");
				painelQuadrado.setLabelValorArea("");
				painelQuadrado.setLabelVolume("");
				painelQuadrado.setValorLado("");
				quadrado.setLado(0);
				quadrado.setArea(0);
				quadrado.setVolume(0);
			
			}
		}
		if(e.getSource() == painelQuadrado.getBotaoLimpar()) {
			painelQuadrado.setLabelValorArea("");
			painelQuadrado.setLabelVolume("");
			painelQuadrado.setValorLado("");
		}
		
	}

}

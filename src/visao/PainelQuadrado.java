package visao;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.Font;
import java.awt.SystemColor;


public class PainelQuadrado extends JPanel {
	private JTextField valorLado;
	private JLabel labelLado;
	private JLabel labelMensagemVolume;
	private JLabel labelValorVolume;
	private JButton botaoCalcular;
	private JLabel labelMensagemArea;
	private JLabel labelValorArea;
	private JButton botaoLimpar;
	
	
	public PainelQuadrado() {
		this.setFont(new Font("Dialog", Font.PLAIN, 15));
		this.setLayout(null);
		setBackground(SystemColor.inactiveCaptionBorder);
		
		labelLado = new JLabel("Lado");
		labelLado.setBounds(31, 56, 70, 15);
		this.add(labelLado);
		
		botaoCalcular = new JButton("Calcular");
		botaoCalcular.setBounds(31, 114, 103, 20);
		this.add(botaoCalcular);
		
		valorLado = new JTextField();
		valorLado.setBounds(98, 54, 111, 19);
		this.add(valorLado);
		valorLado.setColumns(10);
		
		labelMensagemVolume = new JLabel("O valor do volume é:  ");
		labelMensagemVolume.setFont(new Font("Dialog", Font.BOLD, 15));
		labelMensagemVolume.setBounds(31, 214, 178, 40);
		this.add(labelMensagemVolume);
		
		labelValorVolume = new JLabel("");
		labelValorVolume.setFont(new Font("Dialog", Font.BOLD, 16));
		labelValorVolume.setBounds(228, 226, 158, 15);
		this.add(labelValorVolume);
		
		labelMensagemArea = new JLabel("O valor da área é:  ");
		labelMensagemArea.setFont(new Font("Dialog", Font.BOLD, 15));
		labelMensagemArea.setBounds(31, 146, 156, 40);
		this.add(labelMensagemArea);
		
		labelValorArea = new JLabel("");
		labelValorArea.setFont(new Font("Dialog", Font.BOLD, 16));
		labelValorArea.setBounds(216, 159, 158, 15);
		this.add(labelValorArea);
		
		botaoLimpar = new JButton("Limpar");
		botaoLimpar.setBounds(168, 114, 111, 20);
		this.add(botaoLimpar);
		this.setBounds(80, 80, 400, 400);
		this.setVisible(true);
	}


	public String getValorLado() {
		return valorLado.getText();
	}


	public void setValorLado(String valorLado) {
		this.valorLado.setText(valorLado);
	}


	public JLabel getLabelValorCalculado() {
		return labelValorVolume;
	}


	public void setLabelVolume(String labelValorVolume) {
		this.labelValorVolume.setText(labelValorVolume);
	}


	public JButton getBotaoCalcular() {
		return botaoCalcular;
	}


	public void setBotaoCalcular(JButton botaoCalcular) {
		this.botaoCalcular = botaoCalcular;
	}


	public JLabel getLabelValorArea() {
		return labelValorArea;
	}


	public void setLabelValorArea(String labelValorArea) {
		this.labelValorArea.setText(labelValorArea);
	}


	public JButton getBotaoLimpar() {
		return botaoLimpar;
	}


	public void setBotaoLimpar(JButton botaoLimpar) {
		this.botaoLimpar = botaoLimpar;
	}
	
	
	
	
	
	
	
}

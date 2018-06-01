package visao;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;

public class PainelVazio extends JPanel {
	public PainelVazio() {
		setBackground(SystemColor.inactiveCaptionBorder);
		setLayout(null);
		
		JLabel label = new JLabel("Responsáveis");
		label.setFont(new Font("Dialog", Font.BOLD, 16));
		label.setBounds(146, 29, 149, 29);
		add(label);
		
		JLabel label_1 = new JLabel("Quadrado:");
		label_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1.setBounds(40, 96, 92, 15);
		add(label_1);
		
		JLabel label_2 = new JLabel("Gêneses");
		label_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_2.setBounds(50, 123, 82, 15);
		add(label_2);
		
		JLabel label_3 = new JLabel("Reinaldo");
		label_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_3.setBounds(50, 153, 82, 15);
		add(label_3);
		
		JLabel label_4 = new JLabel("Triângulo:");
		label_4.setFont(new Font("Dialog", Font.BOLD, 14));
		label_4.setBounds(177, 96, 92, 15);
		add(label_4);
		
		JLabel label_5 = new JLabel("Anderson");
		label_5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_5.setBounds(177, 123, 82, 15);
		add(label_5);
		
		JLabel label_6 = new JLabel("Gabriel");
		label_6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_6.setBounds(187, 153, 51, 15);
		add(label_6);
		
		JLabel label_7 = new JLabel("Daleth");
		label_7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_7.setBounds(187, 180, 51, 15);
		add(label_7);
		
		JLabel label_8 = new JLabel("Circulo:");
		label_8.setFont(new Font("Dialog", Font.BOLD, 14));
		label_8.setBounds(312, 96, 92, 15);
		add(label_8);
		
		JLabel label_9 = new JLabel("Tainá");
		label_9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_9.setBounds(322, 123, 61, 15);
		add(label_9);
		
		JLabel label_10 = new JLabel("Tailane");
		label_10.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		label_10.setBounds(322, 153, 61, 15);
		add(label_10);
	}
}

package visao;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.SystemColor;

public class FramePrincipal extends JFrame {
	private JMenuBar menuBarra = null;
	private JMenu menu = null;
	private JMenuItem menuItemInicio = null;
	private JMenuItem menuItemTriangulo = null;
	private JMenuItem menuItemCirculo = null;
	private JMenuItem menuItemQuadrado = null;
	
	private PainelVazio painelConteudo;
	
	public FramePrincipal() {
		super();
		this.setSize(400, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setJMenuBar(getMenuBarra());		

		painelConteudo = new PainelVazio();				
		this.setContentPane(painelConteudo);
		
		this.repaint();
		this.validate();
	}

	public JMenuBar getMenuBarra() {
		if(menuBarra == null) {
			menuBarra = new JMenuBar();
			menuBarra.add(getMenu());
		}
		return menuBarra;
	}

	public JMenu getMenu() {
		if(menu == null) {
			menu = new JMenu("Menu");
			menu.add(getMenuItemInicio());
			menu.add(getMenuItemTriangulo());
			menu.add(getMenuItemCirculo());
			menu.add(getMenuItemQuadrado());
		}
		return menu;
	}

	public JMenuItem getMenuItemInicio() {
		if(menuItemInicio == null) {
			menuItemInicio = new JMenuItem("Inicio");
		}
		return menuItemInicio;
	}

	public JMenuItem getMenuItemTriangulo() {
		if(menuItemTriangulo == null) {
			menuItemTriangulo = new JMenuItem("Triangulo");
		}
		return menuItemTriangulo;
	}
	public JMenuItem getMenuItemCirculo(){
		if(menuItemCirculo == null) {
			menuItemCirculo = new JMenuItem("Circulo");
		}
		return menuItemCirculo;
	}
	
	public JMenuItem getMenuItemQuadrado(){
		if(menuItemQuadrado == null) {
			menuItemQuadrado = new JMenuItem("Quadrado");
		}
		return menuItemQuadrado;
	}
}

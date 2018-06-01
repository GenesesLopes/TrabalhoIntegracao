package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.FramePrincipal;
import visao.PainelCirculo;
import visao.PainelQuadrado;
import visao.PainelTriangulo;
import visao.PainelVazio;

public class ControleFramePrincipal implements ActionListener {
	FramePrincipal telaPrincipal;
	PainelVazio telaUm;
	PainelTriangulo telaDois;
	PainelCirculo telaCirculo;
	PainelQuadrado telaQuadrado;
	
	public ControleFramePrincipal() {
		telaPrincipal= new FramePrincipal();
		addEventos();
	}

	private void addEventos() {
		// TODO Auto-generated method stub
		telaPrincipal.getMenuItemInicio().addActionListener(this);
		telaPrincipal.getMenuItemTriangulo().addActionListener(this);
		telaPrincipal.getMenuItemCirculo().addActionListener(this);
		telaPrincipal.getMenuItemQuadrado().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == telaPrincipal.getMenuItemInicio()) {
			telaUm = new PainelVazio();
			
			telaPrincipal.setContentPane(telaUm);
			telaPrincipal.repaint();
			telaPrincipal.validate();
		}
		else if(e.getSource() == telaPrincipal.getMenuItemTriangulo()) {
			telaDois = new PainelTriangulo();
			ControleTriangulo cont = new ControleTriangulo(telaDois);
			
			telaPrincipal.setContentPane(telaDois);
			telaPrincipal.repaint();
			telaPrincipal.validate();
		}
		else if(e.getSource() == telaPrincipal.getMenuItemCirculo()) {
			telaCirculo = new PainelCirculo();
			ControleCirculo cont = new ControleCirculo(telaCirculo);
			
			telaPrincipal.setContentPane(telaCirculo);
			telaPrincipal.repaint();
			telaPrincipal.validate();
		}
		else if(e.getSource() == telaPrincipal.getMenuItemQuadrado()) {
			telaQuadrado = new PainelQuadrado();
			ControladorQuadrado cont = new ControladorQuadrado(telaQuadrado);
			
			telaPrincipal.setContentPane(telaQuadrado);
			telaPrincipal.repaint();
			telaPrincipal.validate();
		}
	}
	
	public static void main(String[] args) {
		new ControleFramePrincipal();
	}
}

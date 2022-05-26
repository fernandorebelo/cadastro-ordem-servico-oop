package classes.oficina.mecanica;

import javax.swing.JOptionPane;

public class Mecanico {

	public String nome;
	
	public void cadastroMecanico() {
		nome = JOptionPane.showInputDialog("Nome do mecânico: ").toUpperCase();
		
	}
}

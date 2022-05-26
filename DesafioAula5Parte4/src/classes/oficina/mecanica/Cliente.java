package classes.oficina.mecanica;

import javax.swing.JOptionPane;

public class Cliente {

	public String cpf, nome, telefone;
	
	public void cadastrarCliente() {
		nome = JOptionPane.showInputDialog("Nome do cliente: ").toUpperCase();
		cpf = JOptionPane.showInputDialog("CPF: ").toUpperCase();
		telefone = JOptionPane.showInputDialog("Telefone: ").toUpperCase();
		
	}
}

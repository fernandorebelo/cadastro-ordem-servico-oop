package classes.oficina.mecanica;

import javax.swing.JOptionPane;

public class Carro {

	public String placa, renavam, marca, modelo;
	
	public void cadastrarCarro() {
		placa = JOptionPane.showInputDialog("Placa: ").toUpperCase();
		renavam = JOptionPane.showInputDialog("Renavam: ").toUpperCase();
		marca = JOptionPane.showInputDialog("Marca do carro: ").toUpperCase();
		modelo = JOptionPane.showInputDialog("Modelo do carro: ").toUpperCase();
		
	}
}

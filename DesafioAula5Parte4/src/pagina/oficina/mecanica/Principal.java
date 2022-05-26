package pagina.oficina.mecanica;

import javax.swing.JOptionPane;

import classes.oficina.mecanica.Carro;
import classes.oficina.mecanica.Cliente;
import classes.oficina.mecanica.Mecanico;
import classes.oficina.mecanica.OrdemServico;

public class Principal {

	public static void main(String[] args) {

		OrdemServico ordemServico = new OrdemServico();
		Cliente cliente = new Cliente();
		Carro carro = new Carro();
		Mecanico mecanico = new Mecanico();
		
		ordemServico.cliente = cliente;	//Instâncias associadas. Criado para não dar NullPointerException.
		ordemServico.carro = carro;
		ordemServico.mecanico = mecanico;
		
		cliente.cadastrarCliente();
		carro.cadastrarCarro();
		mecanico.cadastroMecanico();
		
		System.out.println(ordemServico.resumoOrdemServico());
	}

}

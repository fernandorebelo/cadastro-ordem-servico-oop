package classes.oficina.mecanica;

public class OrdemServico {

	public Carro carro;
	public Cliente cliente;
	public Mecanico mecanico;
	
	public String resumoOrdemServico() {
		
		String resumo = "ORDEM DE SERVIÇO" + "\n";
		resumo += "------------------------" + "\n";
		//Cadastro cliente
		resumo += "DADOS DO CLIENTE: " + "\n";
		resumo += "Cliente: " + cliente.nome + "\n";
		resumo += "CPF: " + cliente.cpf + "\n";
		resumo += "Telefone: " + cliente.telefone + "\n";
		resumo += "------------------------" + "\n";
		//Cadastro carro
		resumo += "DADOS DO VEÍCULO: " + "\n";
		resumo += "Placa: " + carro.placa + "\n";
		resumo += "Renavam: " + carro.renavam + "\n";
		resumo += "Marca: " + carro.marca + "\n";
		resumo += "Modelo: " + carro.modelo + "\n";
		resumo += "------------------------" + "\n";
		//Cadastro mecânico
		resumo += "MECÂNICO SELECIONADO: " + "\n";
		resumo += "Mecânico: " + mecanico.nome;
		
		return resumo;
	}
}

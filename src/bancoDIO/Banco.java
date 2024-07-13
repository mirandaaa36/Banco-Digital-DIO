package bancoDIO;

import java.util.List;

public class Banco {
	
	public String nome;
	public List<Conta> contas; 
	public List<Cliente> clientes; 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void imprimirContas() {
		if (contas != null) {
			for (Conta conta: contas) {
				conta.imprimirBaseExtrato();
			}
		} else {
			System.out.println("Não há contas no banco");
		}
	}
	
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void imprimeCliente() {
		System.out.println("--- Relação de clientes no banco: ");
		for (Cliente cliente: clientes) {
			System.out.println(cliente.getNome() + " \t" + cliente.getCPF());
		}
	}
	
}

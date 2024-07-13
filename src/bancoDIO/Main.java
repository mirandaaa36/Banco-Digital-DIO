package bancoDIO;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Banco digital = new Banco();
		digital.setNome("DIOBANK");
		
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus");
		matheus.setCPF("123.456.789-01");		
		Conta cc_1 = new ContaCorrente(matheus);
		Conta cp_1 = new ContaPoupanca(matheus);
		
		//cc.imprimirExtrato();
		//cp.imprimirExtrato();
		
		cc_1.depositar(200);
		cc_1.transferir(100, cp_1);
		
		//cp.imprimirExtrato();
		
		// Adiciona um segundo cliente
		Cliente marcela = new Cliente();
		marcela.setNome("Marcela");
		marcela.setCPF("789.456.123-10");
		Conta cc_2 = new ContaCorrente(marcela);
		
		// Transfere um valor do cliente 1 para o cliente 2
		
		cc_1.transferir(50, cc_2);
		
		// Imprime as contas do banco
		
		List<Conta> contas = new ArrayList<>();
		contas.add(cp_1);
		contas.add(cc_1);
		contas.add(cc_2);
		
		digital.setContas(contas);
		digital.imprimirContas();
		
		// Imprime a lista de clientes com cpf
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(matheus);
		clientes.add(marcela);
		digital.setClientes(clientes);
		
		digital.imprimeCliente();
			
		
		
		
	}

}

package bancoDIO;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1; // Contador da quantidade de contas que existe no programa, cada vez que um conta é instanciada ele aumenta

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public String getCliente() {
		return cliente.getNome();
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}

	protected void imprimirBaseExtrato() {
		// TODO Auto-generated method stub
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f\n", this.saldo));
		
	}
	
	

}

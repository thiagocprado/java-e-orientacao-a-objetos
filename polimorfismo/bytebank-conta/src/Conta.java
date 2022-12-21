public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;

//    System.out.println("O total de contas é " + Conta.total);

		this.agencia = agencia;
		this.numero = numero;

//    System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void depositar(double valor);

	public void sacar(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			// problema
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;
	}

	public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
		this.sacar(valor);

		destino.depositar(valor);
	}

	public double getSaldo() {
		return saldo;
	}
}
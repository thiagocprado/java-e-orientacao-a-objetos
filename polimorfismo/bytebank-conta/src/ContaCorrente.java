// new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	// na herança você herda atributos e métodos, porém não herda o construtor
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // acessa o construtor da classe mãe
	}

	@Override // anotação
	public void sacar(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.sacar(valorASacar);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}

package src;

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

  public boolean sacar(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }

    return false;
  }

  public boolean transferir(double valor, Conta destino) {
    if (this.sacar(valor)) {
      destino.depositar(valor);
      return true;
    }

    return false;
  }

  public double getSaldo() {
    return saldo;
  }
}
// molde para os objetos/instâncias do tipo Conta
public class Conta {
  // atributos, campos ou proprieades
  private double saldo;
  int agencia = 42;
  int numero;
  Cliente titular = new Cliente();

  // método
  public void depositar(double valor) {
    this.saldo += valor; // indica que é para atribuir ao valor desta conta invocada
  }

  public boolean sacar(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }

    return false;
  }

  public boolean transferir(double valor, Conta contaDestino) {
    if (this.saldo >= valor) {
      this.sacar(300);
      contaDestino.depositar(valor);

      return true;
    }

    return false;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}

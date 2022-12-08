package src;

// molde para os objetos/instâncias do tipo Conta
public class Conta {
  // atributos, campos ou proprieades
  private double saldo;
  private int agencia = 42;
  private int numero;
  private Cliente titular;
  private static int total; // da classe; não precisa de instância para ser iniciado

  // construtor
  public Conta(int agencia, int numero) {
    this.setAgencia(agencia);
    this.setNumero(numero);
//    System.out.println("estou criando uma conta " + this.numero);

    Conta.total++;
//    System.out.println("o total de contas é " + Conta.total);
  }

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

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    if (agencia <= 0) {
      System.out.println("não pode valor menor igual a 0");
    }
    this.agencia = agencia;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    if (numero <= 0) {
      System.out.println("não pode valor menor igual a 0");
    }
    this.numero = numero;
  }

  public Cliente getTitular() {
    return titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return Conta.total;
  }
}

package src;

public class TestaMetodo {

  public static void main(String[] args) {
    Conta contaDoPaulo = new Conta();
    contaDoPaulo.saldo = 100;
    contaDoPaulo.depositar(50);
    System.out.println(contaDoPaulo.saldo);

    boolean conseguiuRetirar = contaDoPaulo.sacar(20);
    System.out.println(contaDoPaulo.saldo);
    System.out.println(conseguiuRetirar);

    Conta contaDaMarcela = new Conta();
    contaDaMarcela.depositar(1000);

    if (contaDaMarcela.transferir(300, contaDoPaulo)) {
      System.out.println("transferência feita com sucesso");
    } else {
      System.out.println("transferência falhou");
    }

    System.out.println("saldo conta da marcela: " + contaDaMarcela.saldo);
    System.out.println("saldo conta do paulo: " + contaDoPaulo.saldo);
  }
}

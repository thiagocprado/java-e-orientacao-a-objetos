package src;

public class CriaConta {

  public static void main(String[] args) {
    // um objeto nunca está dentro de uma variável. A variável armazena uma referência
    Conta primeiraConta = new Conta(); // instância/objeto do tipo conta
    primeiraConta.saldo = 200; // acesso a um atributo de um objeto
    primeiraConta.saldo += 100;

    System.out.println("primeira conta agencia " + primeiraConta.agencia);
    System.out.println("primeira conta numero " + primeiraConta.numero);
    System.out.println("primeira conta saldo " + primeiraConta.saldo);

    Conta segundaConta = new Conta();
    segundaConta.saldo = 50;
    segundaConta.agencia = 146;

    System.out.println("segunda conta agencia " + segundaConta.agencia);
    System.out.println("segunda conta numero " + segundaConta.numero);
    System.out.println("segunda conta saldo " + segundaConta.saldo);
  }
}

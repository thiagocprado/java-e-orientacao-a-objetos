package src;

public class TestaContaSemCliente {
  public static void main(String[] args) {
    Conta contaDaMarcela = new Conta();
    System.out.println(contaDaMarcela.getSaldo());

    System.out.println(contaDaMarcela.titular);

    contaDaMarcela.titular.nome = "Marcela";
    System.out.println(contaDaMarcela.titular.nome);
  }
}
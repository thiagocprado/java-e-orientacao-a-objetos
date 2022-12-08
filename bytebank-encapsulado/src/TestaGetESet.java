package src;

public class TestaGetESet {
  public static void main(String[] args) {
    Conta conta = new Conta(12, 1923);

    conta.setNumero(1337);
    System.out.println(conta.getNumero());

    Cliente paulo = new Cliente();
    paulo.setNome("paulo silveira");

    conta.setTitular(paulo);

    System.out.println(conta.getTitular().getNome());

    conta.getTitular().setProfissao("programador");
    //agora em duas linhas:
    Cliente titularDaConta = conta.getTitular();
    titularDaConta.setProfissao("programador");

    System.out.println(titularDaConta);
    System.out.println(paulo);
    System.out.println(conta.getTitular());
  }
}

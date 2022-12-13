package src;

public class TesteGerente {

  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNome("Mauro Prado");
    g1.setCpf("123423213");
    g1.setSalario(30000);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    g1.setSenha(2222);
    boolean autenticou = g1.autenticar(2222);

    System.out.println(autenticou);
    System.out.println(g1.getBonificacao());

    // interfaces também podem ser utilizadas como assinaturas
    Autenticavel g2 = new Gerente();
  }
}

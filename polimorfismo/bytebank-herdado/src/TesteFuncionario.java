package src;

public class TesteFuncionario {

  public static void main(String[] args) {
    Gerente thiago = new Gerente();
    thiago.setNome("Thiago Prado");
    thiago.setCpf("123456789");
    thiago.setSalario(10000);

    System.out.println(thiago.getNome());
    System.out.println(thiago.getBonificacao());
  }
}

public class TesteReferencia {
  public static void main(String[] args) {
    Funcionario g1 = new Gerente();
    g1.setNome("Marcos");
    g1.setSalario(5000);

    EditorVideo eV1 = new EditorVideo();
    eV1.setNome("Felipe");
    eV1.setSalario(2500);

    Designer d1 = new Designer();
    d1.setNome("Felipe");
    d1.setSalario(2500);

    ControleBonificacao controleBonificacao = new ControleBonificacao();
    // polimorfismo - temos um mesmo objeto, mas há duas maneiras de chegarmos a esse objeto,
    // dois tipos de refêrencia
    controleBonificacao.registrar(g1);
    controleBonificacao.registrar(eV1);
    controleBonificacao.registrar(d1);

    System.out.println(controleBonificacao.getTotalBonificacao());
  }
}

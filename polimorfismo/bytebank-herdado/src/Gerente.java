package src;

// herança - gerente é um funcionário, gerente herda da classe funcionário
public class Gerente extends Funcionario implements Autenticavel {
  private AutenticacaoUtil util;

  public Gerente() {
    this.util = new AutenticacaoUtil();
  }

  @Override
  public void setSenha(int senha) {
    this.util.setSenha(senha);
  }

  @Override
  public boolean autenticar(int senha) {
    return this.util.autenticar(senha);
  }

  public double getBonificacao() {
    System.out.println("Calculando bonificação do gerente");

    // recupera o valor do atributo da classe mãe
    return super.getSalario();
  }
}

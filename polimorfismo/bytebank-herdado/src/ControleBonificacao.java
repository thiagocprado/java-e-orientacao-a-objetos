package src;

public class ControleBonificacao {
  private double totalBonificacao;

  // mesmo utilizando uma classe genérica, os métodos são especificos para cada classe especifica
  public void registrar(Funcionario funcionario) {
    double bonificacao = funcionario.getBonificacao();
    this.totalBonificacao += bonificacao;
  }

  public double getTotalBonificacao() {
    return totalBonificacao;
  }
}

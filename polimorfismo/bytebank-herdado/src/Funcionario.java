package src;

// classes abstratas não podem ser instanciadas, servem como uma base fixa
public abstract class Funcionario {
  private String nome;
  private String cpf;
  private double salario;
  // o modificador de visibilidade protected deixa o atributo visivel para as classes filhas
  //  protected double salario;

  // métodos abstratos não possuem implementação padrão, isso é feito nas classes filhas
  public abstract double getBonificacao();

  // public - modificador de visibilidade
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}

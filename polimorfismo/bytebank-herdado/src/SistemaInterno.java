package src;

public class SistemaInterno {
  private int senha = 1234;

  public void autenticar(Autenticavel a) {
    boolean autenticou = a.autenticar(this.senha);

    if (autenticou) {
      System.out.println("Pode entrar no sistema!");
    } else {
      System.out.println("Não pode entrar no sistema");
    }
  }
}

public class TestaValores {
  public static void main(String[] args) {
    Conta conta = new Conta(1337, 24226);
    System.out.println(conta.getAgencia());

    conta.setAgencia(1232123); // método da instância

    Conta conta2 = new Conta(1337, 24256);
    Conta conta3 = new Conta(1327, 21256);

    System.out.println(Conta.getTotal()); // método da classe
  }
}

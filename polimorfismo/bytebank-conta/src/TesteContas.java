package src;

public class TesteContas {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(111, 1234);
    cc.depositar(100.0);

    ContaPoupanca cp = new ContaPoupanca(222, 1134);
    cp.depositar(200.0);

    cc.transferir(10.0, cp);

    System.out.println("CC: " + cc.getSaldo());
    System.out.println("CP: " + cp.getSaldo());
  }
}

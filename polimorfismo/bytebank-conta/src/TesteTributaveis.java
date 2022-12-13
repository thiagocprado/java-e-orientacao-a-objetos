package src;

public class TesteTributaveis {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(123, 12345);
    cc.depositar(100.0);

    SeguroDeVida seguroDeVida = new SeguroDeVida();

    CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
    calculadorDeImposto.registrar(cc);
    calculadorDeImposto.registrar(seguroDeVida);

    System.out.println(calculadorDeImposto.getTotalImposto());
  }
}

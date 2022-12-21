public class TestaPontoFlutuante {

  public static void main(String[] args) {
    double salario;
    salario = 1250.70;

    System.out.println("meu salário é " + salario);

    double idade;

    double divisao = 3.14 / 2;
    System.out.println(divisao);

    int outraDivisao = 5 / 2; // força o resultado um inteiro
    System.out.println(outraDivisao);

    double novaTentativa = 5.0 / 2; // executa divisao com ponto flutuante
    System.out.println(novaTentativa);

    double novaTentativa2 = 5 / 2; // executa divisao sem ponto flutuante, pois executa primeiro o lado direito antes de atribuir
    System.out.println(novaTentativa2);
  }
}

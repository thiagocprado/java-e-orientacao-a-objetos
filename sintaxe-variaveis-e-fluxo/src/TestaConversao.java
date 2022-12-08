package src;

public class TestaConversao {

  public static void main(String[] args) {
    double salario = 1270.50;
    int valor = (int) salario; // casting
    System.out.println(valor);

    int i = 999999999; // guarda até 9 caracteres
    long l = 999999999999999999L; // guarda até 18 caracteres
    short s = 9999; // guarda até 4 caracteres
    byte b = 127; // guarda números até 127

    double valor1 = 0.2;
    double valor2 = 0.1;
    double total = valor1 + valor2;

    System.out.println(total);

    // float pontoFlutuante = 3.14; para o java 3.14 é double

    float pontoFlutuante = 3.14f;
  }
}

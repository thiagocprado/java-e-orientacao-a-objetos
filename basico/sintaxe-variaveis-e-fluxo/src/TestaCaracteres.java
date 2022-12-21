public class TestaCaracteres {

  public static void main(String[] args) {
    char letra = 'a';
    System.out.println(letra);

    char valor = 66; // a referência das letras são números convertidos
    System.out.println(valor);

    valor = (char) (valor + 1);
    System.out.println(valor);

    // String com S maiusculo é um tipo referência
    String palavra = "alura cursos online de tecnologia";
    System.out.println(palavra);

    palavra = palavra + 2020;
    System.out.println(palavra);
  }
}

public class FluxoComTratamento {

	public static void main(String[] args) throws MinhaExcecao {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		// um bloco try catch, trata exceções podendo levar ou não a não execução dos outros métodos na pilha de execução
		try {
			metodo2();
			// podemos adicionar mais de uma exceção em um bloco catch
		} catch (ArithmeticException | NullPointerException ex) {
			// existem diversos atributos que podemos acessar dentro do retorno da excepetion
			System.out.println(ex.getMessage());
			// ex.printStackTrace();
		}

		// catch (NullPointerException ex) {
		// System.out.println(ex.getMessage());
		// ex.printStackTrace();
		// }

		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			Conta c = null;
			c.deposita();

			// int a = i / 0;

			// try {
			// int a = i / 0;
			// } catch(ArithmeticException ex){
			// System.out.println("Exception");
			// }
		}
		System.out.println("Fim do metodo2");
	}
}

public class TestaContaComExcecao {

	public static void main(String[] args) {
		Conta c = new Conta();

		try {
			c.deposita();
		} catch (MinhaExcecao e) {
			e.printStackTrace();
		}
	}

}

public class Programa {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();

		minhaConta.titular.nome = "Duke";
		minhaConta.setLimite(1000.0);
		minhaConta.deposita(1000.0);
		System.out.println("Titular da conta: " + minhaConta.titular.nome);
		System.out.println("Saldo atual: " + minhaConta.getSaldo());

		if (minhaConta.saca(1999.0)) {			
			System.out.println("Saque efetuado com sucesso");
		} else {
			System.out.println("Falha no saque");
		}

		minhaConta.deposita(500.0);
		System.out.println("Saldo atual: " + minhaConta.getSaldo());
	}
}

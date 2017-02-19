public class Programa {

	public static void main(String[] args) {
		Conta minhaConta = new Conta();

		minhaConta.titular.nome = "Duke";
		minhaConta.saldo = 1000.0;
		System.out.println("Titular da conta: " + minhaConta.titular.nome);
		System.out.println("Saldo atual: " + minhaConta.saldo);

		if (minhaConta.saca(2000.0)) {			
			System.out.println("Saque efetuado com sucesso");
		} else {
			System.out.println("Falha no saque");
		}

		minhaConta.deposita(500.0);
		System.out.println("Saldo atual: " + minhaConta.saldo);
	}
}

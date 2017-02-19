public class Conta {

	int numero;
	double saldo, limite;
	Cliente titular = new Cliente();

	boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double valor) {
		this.saldo += valor;
	}
}

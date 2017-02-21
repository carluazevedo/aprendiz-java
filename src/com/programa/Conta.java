package com.programa;

public class Conta {

	int numero;
	private double saldo, limite;
	Cliente titular = new Cliente();

	// Constructor
	Conta() {
		System.out.println("*** Conta criada com sucesso ***");
	}

	public void setLimite(double valor) {
		this.limite = valor;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	public boolean saca(double valor) {
		if (valor > this.getSaldo()) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
}

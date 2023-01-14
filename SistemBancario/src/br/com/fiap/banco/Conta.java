package br.com.fiap.banco;

public class Conta {
	
	int agencia;
	int numero;
	double saldo;

	public Conta() {
		
	}
	public Conta(int agencia, int numero, double saldo) {
		this.agencia =  agencia;
		this.numero = numero;
		this.saldo = saldo;
	}	

	public void deposito(double valor) {
		this.saldo += valor;  
		
	}
	public void retirar(double valor) {
		this.saldo -= valor;
	}

	public double verificarSado(double saldo) {
		return this.saldo;
	}

}


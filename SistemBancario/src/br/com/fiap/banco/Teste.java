package br.com.fiap.banco;

public  class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		cc.saldo =  100.0;
		cc.agencia = 1388;
		cc.numero = 687384;
		
		
		cc.deposito(500);
		
		System.out.println(cc.verificarSado(0));
		
		
		Conta poupanca = new Conta(111, 222 , 1000);
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSado(0));
		
		
	}
}

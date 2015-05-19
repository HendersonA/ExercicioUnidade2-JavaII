package Conta;

public class ContaPoupanca extends Conta{

	public void debitar(double valor) {
		this.saldo-=valor;
	}

	public void creditar(double valor) {
		this.saldo+=valor;
	}
}
package Conta;

public abstract class Conta {
	
	public abstract void debitar(double valor);
	public abstract void creditar(double valor);
	
	protected double saldo;
	protected String num;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}	
}
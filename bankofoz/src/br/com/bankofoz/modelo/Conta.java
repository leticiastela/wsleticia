package br.com.bankofoz.modelo;

public class Conta {
	
	public Conta() {
		super();
	}

	public Conta(int numero, double saldo, Cliente cliente, Agencia agencia) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
		this.agencia = agencia;
	}
	private int numero;
	private double saldo;
	private Cliente cliente;
	private Agencia agencia;
	
	
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + ", agencia=" + agencia + "]";
	}
	
	public boolean sacar (double valor) {
		if(valor <= saldo)
		{
			saldo -= valor;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean depositar (double valor) {
		if(valor < 0)
		{
			return false;
		}
		else
		{
			saldo += valor;
			return true;
		}
	}
	
	public String getResumo() {
		return "Saldo: " + saldo + "Nome do Cliente:" + cliente.getNome();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
}

package br.com.bankofoz.modelo;

public class Corrente extends Conta {
	
	public Corrente() {
		super();
	}
	public Corrente(int numero, double saldo, Cliente cliente, Agencia agencia, int limite, double taxa) {
		super(numero, saldo, cliente, agencia);
		this.limite = limite;
		this.taxa = taxa;
	}
	private double limite;
	private double taxa;
	
	public String toString() {
		return "Corrente [limite=" + limite + ", taxa=" + taxa + ", toString()=" + super.toString() + "]";
	}
	public boolean sacar (double valor)
	{
		double resultado  = limite + super.getSaldo();
		if(resultado >= valor)
		{
			super.setSaldo(super.getSaldo()-valor);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getSaldo() {
		return limite + super.getSaldo();
	}
	
	public String getResumo() {
		return "Limite:"+ limite + "\n Taxa: " + taxa + 
				"\n Saldo: " + super.getSaldo() + "\n Nome Cliente:" + super.getCliente().getNome();
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
}

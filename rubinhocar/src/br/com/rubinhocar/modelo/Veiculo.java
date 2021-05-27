package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private double valor;
	private int velocidadeAtual;
	private boolean status;

	public void preencherModelo (String param)
	{
		if(param.length()< 10)
		{
			modelo = param.toUpperCase();
		}
	}
	public String retornarModelo() {
		return modelo;
	}


	public void preencherValor(double param)
	{
		if(param > 0)
		{
			valor = param;
		}
	}
	public double retornarValor() {
		return valor;
	}


	public String ligar() {
		status = true;
		return "Status ligado";
	}

	public String desligar() {
		status = false;
		velocidadeAtual = 0;
		return "Status desligado";
	}

	public void acelerar(int param)
	{
		if(status == true)
		{
			velocidadeAtual += param;
		}
	}

	public void desacelerar(int param)
	{
		if(status == true)
		{
			velocidadeAtual -= param;
		}
	}

	public void desacelerar() {
		velocidadeAtual = 0;
	}

	public String retornarTudo() {
		String statusAtual = "Sim";
		if(status == false)
		{
			statusAtual = "Não";
		}
		return "Modelo: " + modelo +
				"\nValor: " + valor +
				"\nVelocidade: " + velocidadeAtual +
				"\nLigado? " + statusAtual;
				
	}
}

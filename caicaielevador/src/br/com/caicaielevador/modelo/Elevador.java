package br.com.caicaielevador.modelo;

public class Elevador {
	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int qtdePessoas;
	private int andarAtual;

	public void preencherNome (String param)
	{
		nome = param.toUpperCase();
	}
	public String retornarNome() {
		return nome;
	}

	public void inicializar(int pAndarMax, int pAndarMin, int pCapPessoas) {
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapPessoas;
	}

	public String retornarResumo() {
		return "Nome: " + nome +
				"\nAndar: " + andarAtual +
				"\nQuantidade de Pessoas: " + qtdePessoas;
	}

	public String subir() {
		String mensagemRetorno = "";
		if(andarAtual > andarMaximo)
		{
			mensagemRetorno = "Já está no último andar!";
		}
		else
		{
			mensagemRetorno = "Subindo!";
			andarAtual ++;
		}

		return mensagemRetorno;
	}

	public String descer() {
		String mensagemRetorno = "";
		if(andarAtual < andarMinimo)
		{
			mensagemRetorno = "Já está no andar mínimo!";
		}
		else
		{
			mensagemRetorno = "Descendo!";
			andarAtual --;
		}

		return mensagemRetorno;
	}
	
	public void sair ()
	{
		if(qtdePessoas > 0)
		{
			qtdePessoas --;
		}
	}
	
	public void entrar (int qtde)
	{
		int result = qtdePessoas + qtde;
		if(result <= capacidadePessoas)
		{
			qtdePessoas += qtde;
		}
	}
	
	public void sair (int qtde)
	{
		int result = qtdePessoas - qtde;
		if(result >= 0)
		{
			qtdePessoas -= qtde;
		}
	}

}

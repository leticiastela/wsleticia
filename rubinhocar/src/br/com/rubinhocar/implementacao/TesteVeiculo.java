package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
	public static void main(String[] args) {
		
		Veiculo objVeiculo = new Veiculo();
		objVeiculo.preencherModelo("Camaro");
		objVeiculo.preencherValor(500.000);
		
		System.out.println(objVeiculo.retornarTudo());
		objVeiculo.ligar();
		objVeiculo.acelerar(20);
		objVeiculo.desacelerar(19);
		System.out.println(objVeiculo.retornarTudo());
		objVeiculo.desligar();
		System.out.println(objVeiculo.retornarTudo());
		
		
	}
}

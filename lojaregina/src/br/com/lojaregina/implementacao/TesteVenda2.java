package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda2 {
	public static void main(String[] args) {
		
		Venda objVenda = new Venda(
				1,
				"02/06/21",
				new Produto(
						100,
						"Camiseta",
						6,
						12,
						10
						),
				new Cliente(
						5,
						"Maria",
						"maria@terra.com",
						"7777-8888",
						new Endereco(
								 "Rua X",
								 "65",
								 "Casa",
								 "Pacaembu",
								 "Jundiaí",
								 "SP",
								 "13276-987"
								)
						),
				new Colaborador(
						7,
						"João",
						new Endereco(
								 "Rua Y",
								 "9",
								 "Apartamento",
								 "Cambuí",
								 "Campinas",
								 "SP",
								 "13548-002"
								),
						"Vendedor",
						5000
						),
				new Pagamento(
						9,
						50,
						"02/06/21",
						"Dinheiro"
						)
				);
		System.out.println(objVenda.toString());
		
	}
}

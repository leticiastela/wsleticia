package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Colaborador;
import br.com.lojaregina.modelo.Endereco;
import br.com.lojaregina.modelo.Pagamento;
import br.com.lojaregina.modelo.Produto;
import br.com.lojaregina.modelo.Venda;

public class TesteVenda {
	public static void main(String[] args) {
		
		Produto objProduto = new Produto();
		Endereco objEndereco = new Endereco();
		Cliente objCliente= new Cliente();
		Colaborador objColaborador = new Colaborador();
		Pagamento objPagamento = new Pagamento();
		Venda objVenda = new Venda();
		
		objEndereco.setLogradouro("Rua Adalberto Fisher");
		objEndereco.setNumero("12");
		objEndereco.setComplemento("Casa");
		objEndereco.setBairro("Parque da Represa");
		objEndereco.setCidade("Jundiaí");
		objEndereco.setUf("SP");
		objEndereco.setCep("13214-865");
		
		objCliente.setAll(objEndereco, 1, "Leticia", "leticia.stela@itau.com", "(11)97333-4444");
		objVenda.setCliente(objCliente);
		
		objProduto.setAll(0, "Jaqueta", 100, 200, 3);
		objVenda.setProduto(objProduto);
		
		objColaborador.setId(2);
		objColaborador.setNome("Maria");
		objColaborador.setEndereco(objEndereco);
		objColaborador.setCargo("Vendedor");
		objVenda.setVendedor(objColaborador);
		
		objPagamento.setValor(600);
		objPagamento.setData("02/06/21");
		objPagamento.setForma("Cartão de débito");
		objVenda.setPagamento(objPagamento);
		
		objVenda.setData("02/06/21");
		
		System.out.println("Nome Cliente: " + objVenda.getCliente().getNome());
		System.out.println("Cidade Cliente: " + objVenda.getCliente().getEndereco().getCidade());
		System.out.println("Vendedor: " + objVenda.getVendedor().getNome());
		System.out.println("Produto: " + objVenda.getProduto().getDescricao());
		System.out.println("Forma de Pagamento: " + objVenda.getPagamento().getForma());
		
		
	}
}

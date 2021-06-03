package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Produto;

public class TesteProduto {
	public static void main(String[] args) {
		
		Produto objProduto = new Produto();
		objProduto.setAll(0, "Camiseta", 50, 60, 30);
		System.out.println(objProduto.toString());
		System.out.println("Desconto 10%:R$" + objProduto.getDesconto());
		System.out.println("Desconto aplicado:R$" + objProduto.getDesconto(50));
		System.out.println("Total da venda:R$" + objProduto.getTotalVenda());
		System.out.println("Situação do estoque:"+objProduto.getVerificarEstoque());
		objProduto.setAtualizarValores(100);
		System.out.println("Após atualização:" + objProduto.toString());
		
	}
}

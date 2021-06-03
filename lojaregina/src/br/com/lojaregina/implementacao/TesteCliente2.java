package br.com.lojaregina.implementacao;

import br.com.lojaregina.modelo.Cliente;
import br.com.lojaregina.modelo.Endereco;

public class TesteCliente2 {
	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		Endereco objEndereco = new Endereco();
		
		objEndereco.setLogradouro("Rua Adalberto Fisher");
		objEndereco.setNumero("12");
		objEndereco.setComplemento("Casa");
		objEndereco.setBairro("Parque da Represa");
		objEndereco.setCidade("Jundiaí");
		objEndereco.setUf("SP");
		objEndereco.setCep("13214-865");
		
		objCliente.setAll(objEndereco, 0, "Leticia", "leticia.stela@teste.com", "98765-4327");
		
		System.out.println(objCliente.toString());
		
		System.out.println("Bairro: " + objCliente.getEndereco().getBairro());
		
		System.out.println(objCliente.getUsuario());
	}
}

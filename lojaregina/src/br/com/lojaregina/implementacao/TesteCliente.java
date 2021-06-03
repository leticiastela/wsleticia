package br.com.lojaregina.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaregina.modelo.Cliente;

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		
		objCliente.setId(Integer.parseInt(JOptionPane.showInputDialog("ID:")));
		objCliente.setNome(JOptionPane.showInputDialog("Nome:").toUpperCase());
		objCliente.setEmail(JOptionPane.showInputDialog("E-mail:").toLowerCase());
		objCliente.setTelefone(JOptionPane.showInputDialog("Telefone:"));
		
		System.out.println("ID:" + objCliente.getId());
		System.out.println("Nome:" + objCliente.getNome());
		System.out.println("E-mail:" + objCliente.getEmail());
		System.out.println("Telefone:" + objCliente.getTelefone());
		System.out.println("Usuário:" + objCliente.getUsuario());
	}
}

package br.com.bankofoz.implementacao;

import javax.swing.JOptionPane;

import br.com.bankofoz.modelo.Agencia;
import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;

public class TesteConta {
	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente(
				1,
				"Cliente",
				"438.987.299-90"
				);
		Agencia objAgencia = new Agencia(
				1234,
				"Conta",
				"98888-5555"
				);
		double saldo = 1000;
		int numero = 123456;
		
		Conta objConta = new Conta();
		if(JOptionPane.showConfirmDialog(null, "Corrente?", "Título", JOptionPane.YES_NO_OPTION)==0)
		{
			objConta = new Corrente(
					numero,
					saldo,
					objCliente,
					objAgencia,
					5000,
					50
					);
		}
		else
		{
			objConta = new Poupanca(
					numero,
					saldo,
					objCliente,
					objAgencia,
					0.05,
					20
					);
		}
		
		System.out.println("Sacar:" + objConta.sacar(1000));
		System.out.println(objConta.toString());
		System.out.println(objConta.getResumo());
		
		
	}
}

package variaveis;

import javax.swing.JOptionPane;

public class CalculoProduto {
	public static void main(String[] args) {
		String nomeProduto = JOptionPane.showInputDialog("Informe o nome do Produto:");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
		float valorUnitario = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário:"));
		float valorTotal = quantidade * valorUnitario;
		float valorImposto = valorTotal * (float)0.17;
		 
		System.out.println("Nome do Produto: " + nomeProduto);
		System.out.println("Valor Total: R$ " + valorTotal + ",00");
		System.out.println("Valor do Imposto: R$ " + valorImposto + ",00");
	}
}

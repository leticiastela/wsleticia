package repeticao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:").toUpperCase();
		String email = JOptionPane.showInputDialog("Digite o e-mail:").toLowerCase();
		String nomeProduto = "";
		float valor = 0;
		int qtd = 0;
		float totalProduto = 0;
		float totalGeral = 0;
		do {
			nomeProduto = JOptionPane.showInputDialog("Digite o nome do Produto:");
			valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Produto:"));
			qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
			totalProduto = valor * qtd;
			System.out.println("Valor total do Produto: R$" + totalProduto);
			totalGeral = totalGeral + totalProduto;
		}
		while(JOptionPane.showConfirmDialog(null, "Continuar?", "Escolha uma op��o", JOptionPane.YES_NO_OPTION)==0);
		System.out.println(nomeCliente + ", o total geral da compra �: R$" + totalGeral);
	}

}

package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		short qtdDiaria = Short.parseShort(JOptionPane.showInputDialog("Informe a quantidade de di�rias:"));
		float valorDiaria = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da di�ria:"));
		float valorPorcentagem = 0;
		if(qtdDiaria > 10)
		{
			 valorPorcentagem =	valorDiaria * (float)0.05;
		}
		else if (qtdDiaria < 5) {
		 valorPorcentagem =	valorDiaria * (float)0.1;
		}
		else {
			 valorPorcentagem =	valorDiaria * (float)0.08;
		}
		float valorTotal = (valorDiaria + valorPorcentagem) * qtdDiaria;
		System.out.printf("O valor total �: %.2f", valorTotal);
	}

}

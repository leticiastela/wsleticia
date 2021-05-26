package repeticao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		String cargo ="";
		float salario = 0;
		float salarioTotal=0;
		int qtdCargo =0;
		float maiorSalario = 0;
		String maiorCargo = "";
		do {
			cargo = JOptionPane.showInputDialog("Digite o cargo:");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário:"));
			salarioTotal += salario;
			qtdCargo++;
			if(salario > maiorSalario) {
				maiorSalario = salario;
				maiorCargo = cargo;
			}
		}
		while(JOptionPane.showConfirmDialog(null, "Continuar?", "Escolha uma opção", JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Salário Total: R$" + salarioTotal);
		System.out.println("Média: R$" + salarioTotal / qtdCargo);
		System.out.println("O maior cargo é " + maiorCargo + "com o valor de " + maiorSalario);
	}
}

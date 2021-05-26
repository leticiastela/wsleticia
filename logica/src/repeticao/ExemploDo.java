package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {
	public static void main(String[] args) {
		String nome = "";
		float peso = 0;
		float altura=0;
		float imc = 0;
		do {
			nome = JOptionPane.showInputDialog("Informe o nome:").toUpperCase();
			peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso:"));
			altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a altura:"));
			imc = peso / (altura * altura);
			System.out.printf("%s,Seu IMC é: %.2f",nome, imc);
		}
		while(JOptionPane.showConfirmDialog(null, "Continuar?", "Escolha uma opção", JOptionPane.YES_NO_OPTION)==0);
	}
}

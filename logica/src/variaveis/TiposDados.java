package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {
 public static void main(String[] args) {
	 String nome = JOptionPane.showInputDialog("Digite o seu nome:");
	 int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));
	 double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura:"));
	 double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
	 double imc = peso / (altura * altura);
	 System.out.println("Nome: " + nome);
	 System.out.println("Idade: " + idade);
	 System.out.println("Altura: " + altura);
	 System.out.println("Peso: " + peso);
	 System.out.println("Seu IMC ?: " + imc);
}
}

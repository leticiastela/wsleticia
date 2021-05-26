package repeticao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número:"));
		int cont = 0;
		int resultado = 0;
		while(cont <= 100) {
			System.out.println(numero + "x" + cont + "=" + (numero * cont));
			cont++;
		}
	}
}

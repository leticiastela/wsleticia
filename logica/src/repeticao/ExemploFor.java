package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero"));
		for(int cont = 0; cont<11; cont++)
		{
			System.out.println(numero+"x" + cont + "=" + (numero * cont));
		}
	}
}

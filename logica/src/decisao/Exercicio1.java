package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		
		float valor1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		float valor2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:"));
		String operador = JOptionPane.showInputDialog("Digite o operador matemático (+, -, / ou *):");
		float resultado = 0;
		
		if(!operador.equals("+") && !operador.equals("-") && !operador.equals("/") && !operador.equals("*"))
		{
			System.out.println("Tipo de operador inválido!");
		}
		else
		{
			if(operador.equals("+"))
			{
				resultado = valor1 + valor2;
			}
			else if(operador.equals("-"))
			{
				resultado = valor1 - valor2;
			}
			else if(operador.equals("/"))
			{
				resultado = valor1 / valor2;
			}
			else
			{
				resultado = valor1 * valor2;
			}
			System.out.println("O resultado da operação é: " + resultado);
		}
		
		
		
		
	}

}

package decisao;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1:"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 2:"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 3:"));
		int posicao;
		if(valor1 != valor2 && valor2 != valor3 && valor3 != valor1)
		{
			if(valor1 > valor2)
			{
				posicao = valor1;
				valor1 = valor2;
				valor2 = posicao;
			}
			if(valor2 > valor3) {
				posicao = valor2;
				valor2 = valor3;
				valor3=posicao;
			}
			if(valor1>valor2)
			{
				posicao = valor1;
				valor1 = valor2;
				valor2 = posicao;
			}
			System.out.println(valor1 + " " + valor2 + " " + valor3);
		}
		else
		{
			System.out.println("Existem valores s�o iguais!");
		}
		
		
	}

}

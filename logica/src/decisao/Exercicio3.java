package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe o nome do colaborador:").toUpperCase();
		byte faltas = Byte.parseByte(JOptionPane.showInputDialog("Informe o n?mero de faltas:"));
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o sal?rio bruto:"));
		float valorINSS = 0;
		if(faltas == 0)
		{
			salario = salario * (float)1.02;
		}
		if(salario <= 1100.00)
		{
			valorINSS = salario * (float)0.07;
		}
		else if(salario >= 1100.00 && salario <= 2203.48)
		{
			valorINSS = salario * (float)0.09;
		}
		else if(salario >= 2203.48 && salario <= 3305.22)
		{
			valorINSS = salario * (float)0.12;
		}
		else
		{
			valorINSS = salario * (float)0.14;
		}
		
		float valorFGTS = salario * (float)0.08;
		System.out.println("Valor do Sal?rio L?quido: " + (salario-valorFGTS-valorINSS));
		salario = salario + valorINSS;
			System.out.println("Valor do Sal?rio Bruto: " + salario);
		}
	}

package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
	public static void main(String[] args) {
		short dia = Short.parseShort(JOptionPane.showInputDialog("Informe o dia:"));
		short mes = Short.parseShort(JOptionPane.showInputDialog("Informe o m�s:"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));

		while(ano < 1920 || ano > 2003)
		{
			ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano novamente:"));
		}
		while(mes < 1 || mes > 12)
		{
			mes = Short.parseShort(JOptionPane.showInputDialog("Informe o m�s novamente:"));
		}
		if(mes == 2)
		{
			while(dia < 1 || dia > 29)
			{
				dia = Short.parseShort(JOptionPane.showInputDialog("Informe o dia novamente:"));
			}
		}
		else if (mes == 4 || mes == 6 || mes==9 || mes ==11)
		{
			while(dia < 1 || dia > 30)
			{
				dia = Short.parseShort(JOptionPane.showInputDialog("Informe o dia novamente:"));
			}
		}
		else
		{
			while(dia < 1 || dia > 31)
			{
				dia = Short.parseShort(JOptionPane.showInputDialog("Informe o dia novamente:"));
			}
		}
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
	}

}

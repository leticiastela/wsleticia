package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {
	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Informe o e-mail:").toLowerCase();

		while(email.contains("@")== false || email.indexOf("@")<2)
		{
			email = JOptionPane.showInputDialog("Informe o e-mail novamente:").toLowerCase();
		}


		String nome = JOptionPane.showInputDialog("Informe o nome:").toUpperCase();
		while(nome.length() < 3 || nome.length() > 20) {
			nome = JOptionPane.showInputDialog("Informe o nome novamente:").toUpperCase();
		}

	}

}

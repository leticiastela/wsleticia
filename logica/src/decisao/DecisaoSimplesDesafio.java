package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe o Nome:").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Informe a idade:"));
		if(idade >= 18 && idade<=70)
		{
			System.out.println(nome + ",o seu voto � obrigat�rio!");
		}
		if(idade ==16 || idade ==17 || idade > 70)
		{
			System.out.println(nome + ", o seu voto � facultativo!");
		}
		if(idade < 16)
		{
			System.out.println(nome + ",voc� ainda n�o pode votar!");
		}
	}

}

package trabalhos;

import javax.swing.JOptionPane;

public class Exercicio6b {
	public static void main() {
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		int i = 0;
		
		while (i < 100) {
			System.out.println(nome);
			i++;
		}
	}
}

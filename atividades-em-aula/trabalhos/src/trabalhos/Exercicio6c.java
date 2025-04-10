package trabalhos;

import javax.swing.JOptionPane;

public class Exercicio6c {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome: ");
		int i = 0;
		
		do {
			System.out.println(nome);
			i++;
		} while (i < 100);
	}
}

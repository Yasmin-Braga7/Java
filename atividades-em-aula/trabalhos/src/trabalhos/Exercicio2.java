package trabalhos;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		String palavra1 =  JOptionPane.showInputDialog("digite a primeira palavra ");
		String palavra2 =  JOptionPane.showInputDialog("digite a segunda palavra ");
		String palavra3 =  JOptionPane.showInputDialog("digite a primeira palavra ");
		JOptionPane.showInternalMessageDialog(null, "VOCÊ DIGITOU: " + palavra1 + " " + palavra2 + " " + palavra3);
	}
}

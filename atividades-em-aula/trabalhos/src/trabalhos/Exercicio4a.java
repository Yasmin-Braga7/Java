package trabalhos;

import java.util.Scanner;

public class Exercicio4a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2, nota3;
		float media;
		
		System.out.println("Primeira nota");
		nota1 = scanner.nextFloat();
		
		System.out.println("Segunda nota");
		nota2 = scanner.nextFloat();
		
		System.out.println("Terceira nota");
		nota3 = scanner.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("---------------------");
		System.out.println("A media foi "+ media);
		
		if (media >= 6.0) {
			System.out.println("-----------");
			System.out.println("APROVADO");
			System.out.println("-----------");
		} else {
			System.out.println("-----------");
			System.out.println("REPROVADO");
			System.out.println("-----------");
		}
		scanner.close();
	}
}

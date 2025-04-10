package trabalhos;

import java.util.Scanner;

public class Exercicio7b{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o número base: ");
			int base = scanner.nextInt();
			System.out.print("Digite o expoente: ");
			int expoente = scanner.nextInt();
			int i = 0;

			int resultado = 1;
			while (i < expoente) {
			    resultado *= base;
			    i++;
			}


			System.out.println("O resultado de " + base + " elevado a " + expoente + " é " + resultado);
		}
    }
}

package trabalhos;

import java.util.Scanner;

public class Exercicio5a {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite um número de 1 a 10: ");
			int numero = scanner.nextInt();
			
			if (numero == 1){
			System.out.println("Um");
			} else if (numero == 2){
			System.out.println("Dois");
			} else if (numero == 3){
			System.out.println("Três");
			} else if (numero == 4){
			System.out.println("Quatro");	
			} else if (numero == 5){
			System.out.println("Cinco");
			} else if (numero == 6){
			System.out.println("Seis");	
			} else if (numero == 7){
			System.out.println("Sete");
			} else if (numero == 8){
			System.out.println("Oito");
			} else if (numero == 9){
			System.out.println("Nove");	
			} else if (numero == 10){
			System.out.println("Dez");
			} else {
				System.out.println("numero invalido");
			}
		}
	}
}

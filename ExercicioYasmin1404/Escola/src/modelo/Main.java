package modelo;

import java.time.LocalDate;

public class Main {
	 public static void main(String[] args) {
	        Professor prof = new Professor("Carlos Silva", "123.456.789-00", LocalDate.of(1980, 5, 10), "P123");

	        Disciplina disciplina = new Disciplina("ADS001", "Programação Orientada a Objetos", 60, prof);

	        Aluno a1 = new Aluno("Ana Lima", "111.111.111-11", LocalDate.of(2000, 2, 15), "A001");
	        Aluno a2 = new Aluno("Bruno Souza", "222.222.222-22", LocalDate.of(1999, 8, 25), "A002");
	        Aluno a3 = new Aluno("Clara Martins", "333.333.333-33", LocalDate.of(2001, 11, 30), "A003");

	        disciplina.adicionarAluno(a1);
	        disciplina.adicionarAluno(a2);
	        disciplina.adicionarAluno(a3);

	        Relatorio.gerarRelatorio(disciplina);
	    }
}

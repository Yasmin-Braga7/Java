package modelo;

public class Relatorio {
	public static void gerarRelatorio(Disciplina disciplina) {
        System.out.println("              | RELATÓRIO DA DISCIPLINA |");
        System.out.println("-------------------------------------------------------- \n");
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Professor: " + disciplina.getProfessor() +"\n");
        System.out.println("-------------------------------------------------------- \n");
        System.out.println("Alunos inscritos:\n");
        for (Aluno aluno : disciplina.getAlunos()) {
            System.out.println("  " + aluno);
        }
    }
}

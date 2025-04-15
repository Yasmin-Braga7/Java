package modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String codigo;
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String codigo, String nome, int cargaHoraria, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (" + codigo + ")";
    }
}

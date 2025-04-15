package modelo;

import java.time.LocalDate;

public class Aluno {
	private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private String matricula;

    public Aluno(String nomeCompleto, String cpf, LocalDate dataNascimento, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return nomeCompleto + " (Matrícula: " + matricula + ")";
    }
}

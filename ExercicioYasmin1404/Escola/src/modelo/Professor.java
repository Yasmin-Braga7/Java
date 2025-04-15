package modelo;

import java.time.LocalDate;

public class Professor {
	private String nomeCompleto;
    private String cpf;
    private LocalDate dataNascimento;
    private String matricula;

    public Professor(String nomeCompleto, String cpf, LocalDate dataNascimento, String matricula) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public String toString() {
        return nomeCompleto + " (Professor)";
    }
}

package br.com.meli.w4.aula2.geraDiploma;

import java.util.List;

public class Aluno {
    private String nome;

    private List<Disciplina> disciplinas;

    public Aluno(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public Double calculaMedia() {
        return this.disciplinas.stream()
                .map(disciplina -> disciplina.getNota())
                .reduce(0.0, (subtotal, nota) -> subtotal + nota) / this.disciplinas.size();
    }
}

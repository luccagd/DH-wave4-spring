package br.com.meli.w4.aula2.geraDiploma;

public class Disciplina {
    private String nome;

    private Double nota;

    public Disciplina(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }
}

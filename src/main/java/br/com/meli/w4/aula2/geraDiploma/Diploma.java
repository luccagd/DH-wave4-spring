package br.com.meli.w4.aula2.geraDiploma;

public class Diploma {
    String nomeAluno;

    Double mediaAluno;

    String mensagem;

    public Diploma(String nomeAluno, Double mediaAluno, String mensagem) {
        this.nomeAluno = nomeAluno;
        this.mediaAluno = mediaAluno;
        this.mensagem = mensagem;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public Double getMediaAluno() {
        return mediaAluno;
    }

    public String getMensagem() {
        return mensagem;
    }
}

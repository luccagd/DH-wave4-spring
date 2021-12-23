package br.com.meli.w4.aula2.calculadoraImobiliaria;

public class Comodo {
    String nome;

    Double largura;

    Double comprimento;

    public Comodo(String nome, Double largura, Double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public Double getLargura() {
        return largura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public Double getArea() {
        return largura * comprimento;
    }
}

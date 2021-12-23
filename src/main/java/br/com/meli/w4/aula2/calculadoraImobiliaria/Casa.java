package br.com.meli.w4.aula2.calculadoraImobiliaria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Casa {
    private final Double PRECO_METRO_QUADRADO = 800.0;

    private String nome;

    private String endereco;

    private List<Comodo> comodos;

    public Casa(String nome, String endereco, List<Comodo> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public List<Comodo> getComodos() {
        return new ArrayList<Comodo>(comodos);
    }

    public Double getArea() {
        return comodos.stream()
                .map(comodo -> comodo.getComprimento() * comodo.getLargura())
                .reduce(0.0, (subtotal, area) -> subtotal + area);
    }

    public Double getValor() {
        return getArea() * PRECO_METRO_QUADRADO;
    }

    public Comodo getMaiorComodo() {
        return comodos.stream().max(Comparator.comparing(comodo -> comodo.getArea())).get();
    }
}

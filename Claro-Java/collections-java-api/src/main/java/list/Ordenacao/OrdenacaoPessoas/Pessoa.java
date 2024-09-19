package main.java.list.Ordenacao.OrdenacaoPessoas;

import java.util.Comparator;

// Para utilizar o Comparable, precisamos implementar a classe Comparable passando como Objeto a classe a ser comparad, em nosso caso <Pessoa>
public class Pessoa implements Comparable<Pessoa> {
    // Atributos
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    // Metodo para implementar o comparable
    @Override
    public int compareTo(Pessoa p) {
        // Comparando as idades utilizando o compare
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}

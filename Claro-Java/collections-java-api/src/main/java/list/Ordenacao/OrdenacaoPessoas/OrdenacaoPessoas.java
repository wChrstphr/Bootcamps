package main.java.list.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    // Atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa( String nome, int idade, double altura){
        pessoaList.add((new Pessoa(nome, idade, altura)));
    }

    public List<Pessoa> ordenarPorIdade(){
      List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
//        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    @Override
    public String toString() {
        return "Pessoa: " + pessoaList + "\n";
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.96);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 24, 1.87);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 29, 1.6);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 15, 1.56);

        System.out.println("\nLista comum");
        System.out.println(ordenacaoPessoa.pessoaList);

        System.out.println("\nLista ordenada por idade");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println("\nLista ordenada por altura");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

package main.java.set.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    // Atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto (long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        // Organizando por nome utilizando uma TreeSet, após ter feito o metodo
        // compareTo, implementado na classe Produto
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirProdutosPorPreco () {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 9", 25D, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 2", 45D, 3);
        cadastroProdutos.adicionarProduto(8L, "Produto 5", 5D, 4);
        cadastroProdutos.adicionarProduto(9L, "Produto 4", 90D, 5);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}

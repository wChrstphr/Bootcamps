package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private final Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else System.out.println("Lista de palavras vazia");
    }

    public void exibirPalavras (){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra (String palavra){
        String definicaoPorPalavra = "";
        if (!dicionarioMap.isEmpty()){
            definicaoPorPalavra = dicionarioMap.get(palavra);
        } else System.out.println("Lista de palavras vazia");
        return definicaoPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Determinação", "Decisão que se toma após reflexão");
        dicionario.adicionarPalavra("Software", "Sequência de passos para se obter um resultado");
        dicionario.adicionarPalavra("Vento", "Ar atmosférico em movimento natural");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Determinação");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Software"));
    }
}

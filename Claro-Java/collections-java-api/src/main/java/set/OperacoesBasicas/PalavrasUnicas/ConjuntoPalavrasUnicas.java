package main.java.set.OperacoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    // Atributos
    private Set<Palavra> conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra (String palavra){
        conjuntoPalavras.add(new Palavra(palavra));
    }

    public void removerPalavra (String palavra) {
        Palavra palavraParaRemover = null;
        if (!conjuntoPalavras.isEmpty()){
            for (Palavra p: conjuntoPalavras) {
                if (p.getPalavra().equalsIgnoreCase(palavra)){
                    palavraParaRemover = p;
                    break;
                }
            }
        }
        conjuntoPalavras.remove(palavraParaRemover);
    }

    public boolean verificarPalavra (String palavra) {
        if (!conjuntoPalavras.isEmpty()){
            for (Palavra p : conjuntoPalavras) {
                if (p.getPalavra().equalsIgnoreCase(palavra)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas () {
        System.out.println(conjuntoPalavras);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Feijão");
        conjuntoPalavrasUnicas.adicionarPalavra("Feijao");
        conjuntoPalavrasUnicas.adicionarPalavra("Feijáo");
        conjuntoPalavrasUnicas.adicionarPalavra("Arroz");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        String palavra = "feijão";
        String contida = conjuntoPalavrasUnicas.verificarPalavra(palavra) ? "A palavra " + palavra + " está contida!" : "A palavra " + palavra + " não está contida!";
        System.out.println(contida);

        conjuntoPalavrasUnicas.removerPalavra("Arroz");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("feijao");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Feijao");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }
}

package main.java.set.OperacoesBasicas.PalavrasUnicas;

import java.util.Objects;

public class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palavra palavra1 = (Palavra) o;
        return Objects.equals(getPalavra().toLowerCase(), palavra1.getPalavra().toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavra().toLowerCase());
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}

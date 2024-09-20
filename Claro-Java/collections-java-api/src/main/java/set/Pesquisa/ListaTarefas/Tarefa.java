package main.java.set.Pesquisa.ListaTarefas;

import java.util.Objects;

public class Tarefa {
    // Atributos
    private final String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }


    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "{" + descricao +"," + concluida + "}";
    }



}

package main.java.set.Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    // Atributos
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa (String descricao) {
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t: tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover = t;
            }
        }
        tarefasSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t: tarefasSet) {
            if (t.isConcluida()) tarefasConcluidas.add(t);
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes () {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t: tarefasSet){
            if (!t.isConcluida()) tarefasPendentes.add(t);
        }
        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida (String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t: tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                tarefaConcluida = t;
                break;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente (String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t: tarefasSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                tarefaPendente = t;
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas(){
        Set<Tarefa> listaParaLimpar = new HashSet<>(tarefasSet);
        tarefasSet.removeAll(listaParaLimpar);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Exibindo tarefa");
        listaTarefas.exibirTarefas();
        System.out.println("Numero de tarefas: " + listaTarefas.contarTarefas());
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.adicionarTarefa("Ir a academia");
        listaTarefas.adicionarTarefa("Beber água");
        listaTarefas.adicionarTarefa("Alongar");
        listaTarefas.adicionarTarefa("Codar");

        System.out.println("Exibindo tarefa");
        listaTarefas.exibirTarefas();
        System.out.println("Numero de tarefas: " + listaTarefas.contarTarefas());
        System.out.println(listaTarefas.marcarTarefaConcluida("Beber água"));
        System.out.println(listaTarefas.marcarTarefaConcluida("Ir a academia"));

        System.out.println("Exibindo tarefa");
        listaTarefas.exibirTarefas();

        System.out.println("Marcando tarefa pendente");
        System.out.println(listaTarefas.marcarTarefaPendente("Ir a academia"));
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());


        System.out.println("Excluindo tarefa e exibindo");
        listaTarefas.removerTarefa("Beber água");
        listaTarefas.exibirTarefas();


        System.out.println("Limpando todas as tarefas da lista");
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}

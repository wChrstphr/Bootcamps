package main.java.set.Ordenacao.GerenciarAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    // Atributos
    private Set<Aluno> alunoSet;

    public GerenciarAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno (String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno (long matricula){
        Aluno alunoParaRemover = null;
        for (Aluno a: alunoSet){
            if (a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorMedia(){
        Set<Aluno> alunosPorMedia = new TreeSet<>(new ComparatorPorMedia());
        alunosPorMedia.addAll(alunoSet);
        return alunosPorMedia;
    }

    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        gerenciarAlunos.adicionarAluno("Nome 1", 234L, 5D);
        gerenciarAlunos.adicionarAluno("Nome 2", 165L, 8D);
        gerenciarAlunos.adicionarAluno("Nome 3", 454L, 6D);
        gerenciarAlunos.adicionarAluno("Nome 4", 632L, 9D);

        System.out.println(gerenciarAlunos.alunoSet);

        System.out.println(gerenciarAlunos.exibirAlunosPorMedia());

        System.out.println(gerenciarAlunos.exibirAlunosPorNome());
    }
}

package main.java.set.Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    // Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato (String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos () {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome (String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato (String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Christopher Paraizo", 1234);
        agendaContatos.adicionarContato("Christopher Paraizo", 1234);
        agendaContatos.adicionarContato("Christopher Castro", 1234);
        agendaContatos.adicionarContato("Jose Mendes", 1234);
        agendaContatos.exibirContatos();

        agendaContatos.atualizarNumeroContato("Christopher Paraizo", 342513);
        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Christopher"));

    }
}

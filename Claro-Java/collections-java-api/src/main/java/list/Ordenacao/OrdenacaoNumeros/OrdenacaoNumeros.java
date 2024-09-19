package main.java.list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;

public class OrdenacaoNumeros {
    private List<NumeroInteiro> numerosInteirosList;

    public OrdenacaoNumeros() {
        this.numerosInteirosList = new ArrayList<>();
    }

    public void adicionarNumero (int numero) {
        numerosInteirosList.add(new NumeroInteiro(numero));
    }

    public List<NumeroInteiro> ordenarAscendente() {
        List<NumeroInteiro> numerosInteirosAscendente = new ArrayList<>(numerosInteirosList);
        Collections.sort(numerosInteirosAscendente);
        return numerosInteirosAscendente;
    }

    public List<NumeroInteiro> ordenarDescendente() {
        List<NumeroInteiro> numerosInteirosDescendente = new ArrayList<>(numerosInteirosList);
        Collections.sort((numerosInteirosDescendente));
        Collections.reverse(numerosInteirosDescendente);
        return numerosInteirosDescendente;
    }

    private void reverseOrder(List<NumeroInteiro> numerosInteirosDescendente) {
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(-5);
        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println(ordenacaoNumeros.numerosInteirosList);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}

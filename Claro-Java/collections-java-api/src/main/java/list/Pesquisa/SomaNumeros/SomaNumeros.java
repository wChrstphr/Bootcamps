package main.java.list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero (int numero) {
        numeroList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeroList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numeroList.isEmpty()){
            for (Integer numero : numeroList) {
                maiorNumero = numero > maiorNumero ? numero : maiorNumero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if (!numeroList.isEmpty()){
            for (Integer numero : numeroList) {
                menorNumero = numero < menorNumero ? numero : menorNumero;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros(){
        return numeroList;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-39);
        somaNumeros.adicionarNumero(39);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);

        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.calcularSoma());

    }
}

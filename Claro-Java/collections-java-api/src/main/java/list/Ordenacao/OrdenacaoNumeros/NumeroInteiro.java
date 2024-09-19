package main.java.list.Ordenacao.OrdenacaoNumeros;

public class NumeroInteiro implements Comparable<NumeroInteiro> {
    int numero;

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(NumeroInteiro numeroInteiro) {
        return Integer.compare(numero, numeroInteiro.getNumero());
    }

    @Override
    public String toString() {
        return "NumeroInteiro{" +
                "numero=" + numero +
                '}';
    }
}

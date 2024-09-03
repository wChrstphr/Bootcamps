package dio.christopher.metodos;


public class Metodos {

    // metodo publico as outras classes
    public void imprimir(String texto){
    }

    // utiliza-se throw para excecoes que podem ocorrer num metodo
    public double dividir (int dividendo, int divisor) throws Exception {
        double resultado = 0;
        if (divisor == 0){
            throw new Exception("Can't divide by 0");
        }
        return resultado;
    }

    // metodos private nao podem ser vistos em outras classes
    private void metodoPrivado(){}

    // comparando metodos
    public void gravarCliente (String nome, String cpf, int ID){
        // podemos abstrair esse metodo 
        // criando uma classe cliente
        // com todas as caracteristicas
    }
    public void gravarCliente(Cliente cliente){}
    // ou 
    public void gravar(Cliente cliente){}
}


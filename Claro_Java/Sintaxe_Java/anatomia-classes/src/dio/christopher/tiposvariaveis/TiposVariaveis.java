package dio.christopher.tiposvariaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 24;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98377594823L; // se começar com zero, será necesário usar o tipo String
        //float pi = 3.14F; // se começar com zero, será necesário usar o tipo String
        double salario = 1275.25;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final int MEU_NUMERO = 1;
        final float VALOR_PI = 3.14F;

        // MEU_NUMERO = 2; 
        
        System.out.println(MEU_NUMERO);
    }
}

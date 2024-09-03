package trycatchtests;

public class FormatadorCep {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("2375606");
            System.out.println("Cep formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Formato invalido");
        }

    }

    // metodo para lidar com a excecao de Cep Invalido
    public static String formatarCep (String cep) throws CepInvalidoException {
        if (cep.length() != 8){
            throw new CepInvalidoException();
        }

        // simulando um cep ja formatado
        return "23.756-063";
    }
}

/**
 * <h1>ParametrosInvalidosException</h1>
 * Essa classe lança uma exceção do tipo Parametro Inválido.
 * Complementando as regras de negócio da classe <b>Contador</b>.
 */


public class ParametrosInvalidosException extends Exception{
    /**
     * Construtor padrão para ParametrosInvalidosException.
     * Este construtor chama o construtor padrão da classe Exception.
     */
    public ParametrosInvalidosException() {
        super();
    }
    /**
     * Construtor que aceita uma mensagem de erro.
     *
     * @param mensagem A mensagem de erro associada a esta exceção.
     */
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    
}

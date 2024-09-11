package polimorfismo.app;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();

	protected void validarConexaoInternet() {
		System.out.println("Validando conexão com a internet");
	};
	
	protected abstract void salvarHistoricoMensagem();
}

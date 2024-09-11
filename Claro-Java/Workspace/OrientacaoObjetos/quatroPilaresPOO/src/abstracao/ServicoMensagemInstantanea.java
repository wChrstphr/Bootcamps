package abstracao;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();

	protected abstract void validarConeccaoInternet();
	
	protected abstract void salvarHistoricoMensagem();
}

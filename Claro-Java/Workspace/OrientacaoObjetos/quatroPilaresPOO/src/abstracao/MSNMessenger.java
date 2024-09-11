package abstracao;

public class MSNMessenger extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		validarConeccaoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	@Override
	protected void validarConeccaoInternet() {
		System.out.println("Validando coneccao MSN");
		
	}
	@Override
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando historico MSN");
	}
}


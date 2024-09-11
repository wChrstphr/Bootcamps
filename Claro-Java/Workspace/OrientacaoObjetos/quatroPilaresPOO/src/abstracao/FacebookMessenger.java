package abstracao;


public class FacebookMessenger extends ServicoMensagemInstantanea{
	@Override
	public void enviarMensagem() {
		validarConeccaoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
	@Override
	protected void validarConeccaoInternet() {
		System.out.println("Validando coneccao Facebook");
		
	}
	@Override
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando historico Facebook");
	}
}


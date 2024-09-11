package polimorfismo.app;


public class FacebookMessenger extends ServicoMensagemInstantanea{
	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
	@Override
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando historico Facebook");
	}
}


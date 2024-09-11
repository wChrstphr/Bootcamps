package polimorfismo.app;

public class MSNMessenger extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		validarConexaoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	@Override
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando historico MSN");
	}
}


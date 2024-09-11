package abstracao;

public class Telegram extends ServicoMensagemInstantanea{
	@Override
	public void enviarMensagem() {
		validarConeccaoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	@Override
	protected void validarConeccaoInternet() {
		System.out.println("Validando coneccao Telegram");
		
	}
	@Override
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando historico Telegram");
	}
}
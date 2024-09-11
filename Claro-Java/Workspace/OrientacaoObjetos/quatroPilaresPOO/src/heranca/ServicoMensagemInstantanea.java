package heranca;

public class ServicoMensagemInstantanea {
	public void enviarMensagem() {
		// confirmando concecao com a internet
		validarConeccaoInternet();
		System.out.println("Enviando mensagem");
		// apos enviada a mensagem, salva o historico
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
	
	// metodo privados, visiveis somente a classe
	// implementacao de encapsulamento
	private void validarConeccaoInternet() {
		System.out.println("Validando conexão");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico");
	}
}

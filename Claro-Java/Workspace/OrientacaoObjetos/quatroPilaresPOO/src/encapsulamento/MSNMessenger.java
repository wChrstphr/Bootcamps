package encapsulamento;

public class MSNMessenger {
	public void enviarMensager() {
		validarConeccaoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	
	public void receberMensager() {
		System.out.println("Recebendo mensagem");
	}
	
	private void validarConeccaoInternet() {
		System.out.println("Validando conexão");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico");
	}
}

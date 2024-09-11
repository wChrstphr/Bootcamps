package abstracao;

public class Computador {
	public static void main(String[] args) {
		// open MSN
		MSNMessenger msn = new MSNMessenger();
		msn.receberMensagem();
		msn.enviarMensagem();
		
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}
	
}

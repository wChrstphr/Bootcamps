package polimorfismo;

import polimorfismo.app.FacebookMessenger;
import polimorfismo.app.MSNMessenger;
import polimorfismo.app.ServicoMensagemInstantanea;
import polimorfismo.app.Telegram;

public class Computador {
	public static void main(String[] args) {
			ServicoMensagemInstantanea smi = null;
			
			// É passado o parâmetro NULL pois não sabemos qual app
			// o usuário quer abrir
			
			String appEscolhido	= "fcb";
			
			smi = appEscolhido.equalsIgnoreCase("msn") ? new MSNMessenger() : 
				appEscolhido.equalsIgnoreCase("fcb") ? new FacebookMessenger() : 
				appEscolhido.equalsIgnoreCase("tlg") ? new Telegram() : null;
			
			if (smi != null) {				
				smi.enviarMensagem();
				smi.receberMensagem();
			} else {
				System.out.println("Aplicativo não reconhecido.");
			}
			
	}
	
}

package resumoQuatroPilares;

//Classe especializada
public class Carro extends Veiculo {
	private boolean conferirCombustivel() {
		System.out.println("Conferindo Combustivel");
		double nivelCombustivel = 52.50;
		boolean combustivelConferido = nivelCombustivel >= 50;
		return combustivelConferido;
	}
	
	private boolean conferirCambio() {
		System.out.println("Conferindo cambio em P");
		String cambio = "C";
		boolean cambioConferido = cambio.equalsIgnoreCase("P");
		return cambioConferido;
	}
	@Override
	public void ligar() {
		String estadoCarro = conferirCombustivel() && conferirCambio() ? 		"Carro Ligado" : "Carro Desligado";
		System.out.println(estadoCarro);
	}
	@Override
	public void desligar() {
		System.out.println("Carro desligado");
		
	}
}

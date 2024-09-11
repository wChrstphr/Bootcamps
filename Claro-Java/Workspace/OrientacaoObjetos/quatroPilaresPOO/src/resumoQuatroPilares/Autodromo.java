package resumoQuatroPilares;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("3871283");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("38213");
		z400.ligar();
		z400.desligar();
		
		Veiculo coringaVeiculo = jeep;
		
		coringaVeiculo.ligar();
	}
}

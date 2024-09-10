package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("Controlando de entrada");
	}
	private void controlarSaida() {
		System.out.println("Controlando a saida");
	}
	// utilizando o modificador DEFAULT para que o metodo seja
	// acessivel apenas as classes do mesmo pacote
	void trocarGas() {
		System.out.println("Almoxarife trocando o gas");
	}
	void entregarIngredientes() {
		controlarEntrada();
		System.out.println("Entrega de ingredientes pelo almoxarifado");
		controlarSaida();
	}
}

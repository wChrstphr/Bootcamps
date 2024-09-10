package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarPedidoBalcao();
		pegarLancheCozinha();
		System.out.println("Servindo mesa");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("Pegando o lanche na cozinha");
	}
	
	public void receberPagamento() {
		System.out.println("Recebendo pagamento");
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no balcao");
	}

	void trocarGas() {
		System.out.println("Atendente trocando o gas");
	}
}

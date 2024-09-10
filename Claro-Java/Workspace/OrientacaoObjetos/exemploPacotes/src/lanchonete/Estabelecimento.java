package lanchonete;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		// ações que nao precisam estar disponíveis para toda a aplicacao
		cozinheiro.lavarIngredientes();
		cozinheiro.selecionarIngredientesLanche();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesLanche();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		
		// ações que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		// ações que nao precisam estar disponíveis para toda a aplicacao
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		
		// ações que somente o pacote cozinha precisa conhecer (default)
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		// ações que somente o pacote cozinha precisa conhecer (default)
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		
		// nao deveria, mas o estabelecimento ainda nao
		// definiu as normas de atendimento
		cliente.pegarPedidoBalcao();
		
		// esta ação acaba sendo sigilosa, poderia ser privada (private)
		cliente.consultarSaldoAplicativo();
		
		
	}
}

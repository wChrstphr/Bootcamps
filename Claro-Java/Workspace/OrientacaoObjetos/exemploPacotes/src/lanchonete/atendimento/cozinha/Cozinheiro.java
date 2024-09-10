package lanchonete.atendimento.cozinha;


public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche no balcao");
	}
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando suco no balcao");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		selecionarIngredientesLanche();
		lavarIngredientes();
		System.out.println("Preparando lanche");
	}
	private void prepararVitamina() {
		selecionarIngredientesVitamina();
		lavarIngredientes();
		baterVitaminaLiquidificador();
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("Selecionando ingredientes para lanche");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("Selecionando ingredientes para vitamina");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina");
	}
	void pedirIngredientes (Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}

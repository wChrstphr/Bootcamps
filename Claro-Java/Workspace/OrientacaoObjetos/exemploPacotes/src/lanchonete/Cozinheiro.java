package lanchonete;

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
	
	public void prepararLanche() {
		System.out.println("Preparando lanche");
	}
	
	public void prepararVitamina() {
		System.out.println("Preparando vitamina");
	}
	
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	public void selecionarIngredientesLanche() {
		System.out.println("Selecionando ingredientes para lanche");
	}
	
	public void selecionarIngredientesVitamina() {
		System.out.println("Selecionando ingredientes para vitamina");
	}
	
	public void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	
	public void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina");
	}
	
	public void pedirParaTrocarGas (Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	
	public void pedirIngredientes (Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}

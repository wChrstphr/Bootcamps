package enums;

public class SistemaIbge {
	public static void main(String[] args) {
		for (EstadoBrasileiro estados: EstadoBrasileiro.values()) {
			 System.out.println(estados.getSigla() + " - " + estados.getNome() + " - " + estados.getIbge());
		}
		
		EstadoBrasileiro estado2 = EstadoBrasileiro.RIO_JANEIRO;
		
		System.out.println(estado2.getSigla() + " - " + estado2.getNome() + " - " + estado2.getIbge());
	}
}

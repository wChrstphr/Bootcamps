package enums;

public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo", 11),
	PIAUI ("PI", "Piauí", 13),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 15),
	MARANHAO ("MA", "Maranahão", 22);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	public String getSigla() {
		return sigla;
	}
	public int getIbge() {
		return ibge;
	}
}

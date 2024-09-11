package gettersesetters.escola;

public class Escola {
	public static void main(String[] args) {
		Aluno caio = new Aluno();
		
		caio.setNome("Caio Oliveria");
		caio.setIdade(3);
		
		System.out.println("O aluno " + caio.getNome() + " tem " + caio.getIdade() + " anos de idade");
	}
}

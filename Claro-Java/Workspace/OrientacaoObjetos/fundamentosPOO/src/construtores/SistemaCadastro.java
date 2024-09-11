package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criando uma pessoa no sistema
		Pessoa pessoa1 = new Pessoa("Joao", "069341512");
		
		// definindo endereco de Joao
		pessoa1.setEndereco("Rua Oliveira");
		System.out.println("Nome: " + pessoa1.getNome() + "\nCPF: " + pessoa1.getCpf() + "\nEndereço: " + pessoa1.getEndereco());
	}
}

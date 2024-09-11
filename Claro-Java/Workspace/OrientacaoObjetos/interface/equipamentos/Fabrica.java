package equipamentos;

import equipamentos.impressora.Impressora;
import equipamentos.impressora.Xerox;
import equipamentos.multifuncional.EquipamentoMultifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;

public class Fabrica {
	public static void main(String[] args) {
		// Instanciando nova classe Xerox, da interface Impressora
		Impressora impressora = new Xerox();
		// Imprimindo COMO Xerox
		impressora.imprimir();
		
		// Atribuindo EquipamentoMultifuncional 'em' à impressora criada
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		impressora = em;
		// Imprimindo COMO EquipamentoMultifuncional
		impressora.imprimir();
		
		// Instanciando outra classe Xerox, da interface Impressora
		Impressora impressoraDois = new Xerox();
		// Atribuindo uma Impressora diferente 'impressoraDois' à primeira Impressora 'impressora'
		impressora = impressoraDois;
		// Imprimindo COMO Impressora
		impressora.imprimir();
		
		
		// Instanciando e atribuindo a classe EquipamentoMultifuncional 'em' às interfaces Impressora, Copiadora e Digitalizadora
		Impressora impres = em;
		Copiadora copiadora = em;
		Digitalizadora digitalizadora = em;
		
		// Utilizando os métodos como EquipamentoMultifuncional
		impres.imprimir();
		copiadora.copiar();
		digitalizadora.digitalizar();
	}
}

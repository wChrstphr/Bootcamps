
public class PilhaExecucao {
    public static void main(String[] args) {
        System.out.println("Inicio do programa no método main.");
        a();
        System.out.println("Finalização do programa no método main.");
    }

    public static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    public static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i < 4; i++) {
            System.out.println("Contando no metodo b: " + i);
        }
        c();
        System.out.println("Finalizou o método b.");
    }

    public static void c() {
        System.out.println("Entrou no método c."); 
        // Esse metodo serve para sabermos a trilha, ou pilha 
        // de execucao do metodo c e de onde ele veio
        // ! A leitura deve ser feita de BAIXO para CIMA !
        Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}

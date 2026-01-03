package NivelAvancado.EscopoEstatico_VariaveisGlobais;

public class Ninja {
    String nome;

    //O que estiver fora do escopo static deve ser inicializado um objeto para ser chamado
    public static void sharingan() {
        System.out.println("Sharingan static");
    }

    //O que estiver dentro do escopo static pode ser chamado pela classe sem inicializar um objeto
    public void kyubi() {
        System.out.println("Kyubi fora do escopo static");
    }
}

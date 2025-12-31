package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 2.10;

    public Ninja() {
    }

    final void tacarKunai() {
        System.out.println("EU SOU UM METODO DA CLASSE MAE!");
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha ESTRATEGIA de combate");
    }

    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " Essa é minha INTELIGENCIA de combate");
    }

    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e voce é um genio");
        } else if ( qi >= 130 ) {
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais suas estrategias");
        }

    }

    public void metodoProvisorio() {
        System.out.println("teste na classe Ninja");
    }



}

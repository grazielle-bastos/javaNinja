package NivelIntermediario;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    int idade;
    String aldeia;
    String habilidadeEspecial;

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial: " + habilidadeEspecial);
    }

    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Kunai atingido");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de combate");
    }

}

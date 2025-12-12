package NivelIntermediario;

public class Hinata extends Ninja {

    public void AtivarPoderHinata() {
        System.out.println("Eu sou " + nome + ". E eu ativei minha cura fora do comum");
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é " + nome);
    }
}

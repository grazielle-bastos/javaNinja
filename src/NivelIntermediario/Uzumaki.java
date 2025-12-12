package NivelIntermediario;

public class Uzumaki extends Ninja implements NinjaInterface {

    public void tacarUmaShuriken() {
        System.out.println("Shuriken atingido");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de combate");
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é " + nome);
    }
}

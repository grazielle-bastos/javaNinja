package NivelIntermediario.Generics;

public class Main {

    public static void main(String[] args) {
        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamento(kunai);
        bolsaGenerica.adicionarEquipamento(shuriken);
        bolsaGenerica.adicionarEquipamento(pergaminho);

        System.out.println(bolsaGenerica);
    }
}

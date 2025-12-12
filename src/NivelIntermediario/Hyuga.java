package NivelIntermediario;

public class Hyuga extends Ninja {
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Byakugan Ativou, e eu sou um Hyuga");
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é " + nome);
    }
}

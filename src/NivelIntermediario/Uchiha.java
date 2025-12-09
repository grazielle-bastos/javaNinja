package NivelIntermediario;

public class Uchiha extends Ninja {

    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + " o Sharingan Ativou, eu sou um Uchiha!");
    }

    public String mostrarHabilidadeEspecial() {
        return "Sharingan";
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAldeia: " + aldeia + "\nMissao: " + missao + "\nNivel Dificuldade: " + nivelDificuldade + "\nStatus Missao: " + StatusMissao + "\nHabilidade Especial: " + habilidadeEspecial);
    }
}

package NivelIntermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;
    String missao;
    String nivelDificuldade;
    String StatusMissao;
    String habilidadeEspecial;

    public void ShariganAtivado() {
        System.out.println("O Sharigan foi ativado");
    }

    public String EuSouUmNinja() {
        return "Oi, eu sou um ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAldeia: " + aldeia + "\nMissao: " + missao + "\nNivel Dificuldade: " + nivelDificuldade + "\nStatus Missao: " + StatusMissao);
    }

    public String mostrarHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial: " + habilidadeEspecial);
    }

}

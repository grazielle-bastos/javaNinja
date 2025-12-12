package Desafios.Desafio4;

public class NinjaAvancado implements Ninja {

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nHabilidade: " + habilidade + "\nEspecialidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade: " + habilidade);
    }
}

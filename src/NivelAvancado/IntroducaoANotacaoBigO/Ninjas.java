package NivelAvancado.IntroducaoANotacaoBigO;

public class Ninjas {

    private String nome;
    private int idade;

    public Ninjas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninjas{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}

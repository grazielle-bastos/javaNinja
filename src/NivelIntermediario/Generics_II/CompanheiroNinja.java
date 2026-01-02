package NivelIntermediario.Generics_II;

public class CompanheiroNinja {
    private String nome;

    public CompanheiroNinja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CompanheiroNinja [nome=" + nome + "]";
    }
}

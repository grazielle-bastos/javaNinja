package NivelFacil.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Este ninja está com mais de 10 missões" : "Este ninja está com menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}

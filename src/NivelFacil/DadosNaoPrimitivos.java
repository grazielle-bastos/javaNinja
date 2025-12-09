package NivelFacil;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println("Este texto está em CAPSLOCK: " + nomeEmCaixaAlta);
        System.out.println("Este texto está normal: " + nome);

        String aldeia = "Aldeia de folha";
        String aldeiaEmCaixaBaixa= aldeia.toLowerCase();
        System.out.println(aldeiaEmCaixaBaixa);

    }
}

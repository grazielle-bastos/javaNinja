package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto Uzumaki", "naruto@uzumaki.com", 123456);
        System.out.println("Cadastro = "+ cadastro);

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Naruto Uzumaki", "naruto@uzumaki.com", 123456);
        System.out.println("Cadastro usando Record = " + cadastroUsandoRecord.emailCaixaAlta());
        System.out.println("Nome = " + cadastroUsandoRecord.nome());
    }
}

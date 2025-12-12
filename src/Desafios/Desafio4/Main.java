package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaBasico ninjaBasico = new NinjaBasico("Naruto", 17, "Chidori", "Chidori");
        ninjaBasico.mostrarInformacoes();
        ninjaBasico.executarHabilidade();
        System.out.println("============================");


        NinjaAvancado ninjaAvancado = new NinjaAvancado("Sasuke", 18, "Sharingan", "Sharingan");
        ninjaAvancado.mostrarInformacoes();
        ninjaAvancado.executarHabilidade();
    }
}

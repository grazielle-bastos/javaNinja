package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: " + "\n 1 - Naruto Uzumaki" + "\n 2 - Sasuke Uchiha" + "\n 3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você escolheu: " + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu Sakura Haruno");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
                break;
        }

        scanner.close();

    }


}

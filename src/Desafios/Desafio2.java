package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Não é possível cadastrar mais ninjas, a lista de ninjas está cheia.");
                    }
                    break;

                case 2 :
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("\n===== Lista de Ninjas =====");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;

                case 3 :
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
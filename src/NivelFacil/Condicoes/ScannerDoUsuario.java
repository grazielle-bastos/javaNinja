package NivelFacil.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println("Digite a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos de vida");

        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia");
        }  else
            System.out.println("Esse ninja ainda é menor de idade e não pode ir para missões fora da aldeia");

        caixaDeTexto.close();
    }
}

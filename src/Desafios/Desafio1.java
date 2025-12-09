package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String missao = "Encontrar o bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'S';

        if (idadeNinja1 < 15){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Concluída";
            } else {
                statusDaMissao = "Não concluída, idade insuficiente";
            }
        } else {
            statusDaMissao = "Concluída";
        }

        System.out.println("––––––––––––––––––––––––––––––––––––––––––");

        System.out.println("Nome do ninja: " + nomeNinja1 + "\nIdade do ninja: " + idadeNinja1 + "\nMissão: " + missao + "\nStatus da missão: " + statusDaMissao + "\nNível da missão: " + nivelDaMissao);

        System.out.println("––––––––––––––––––––––––––––––––––––––––––");

        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 15;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        if (idadeNinja2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluído";
            } else {
                statusDaMissao2 = "Não concluído";
            }
        } else {
            statusDaMissao2 = "Concluído, pelo critério de idade";
        }

        System.out.println("––––––––––––––––––––––––––––––––––––––––––");

        System.out.println("Nome do ninja: " + nomeNinja2 + "\nIdade do ninja: " + idadeNinja2 + "\nMissão: " + missao2 + "\nStatus da missão: " + statusDaMissao2 + "\nNível da missão: " + nivelDaMissao2);

        System.out.println("––––––––––––––––––––––––––––––––––––––––––");

        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 20;
        String missao3 = "Curar feridos da guerra";
        String statusDaMissao3 = "Concluído";
        char nivelDaMissao3 = 'D';

        if (idadeNinja3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluído";
            } else {
                statusDaMissao3 = "Não concluído";
            }
        }

        System.out.println("––––––––––––––––––––––––––––––––––––––––––");

        System.out.println("Nome do ninja: " + nomeNinja3 + "\nIdade do ninja: " + idadeNinja3 + "\nMissão: " + missao3 + "\nStatus da missão: " + statusDaMissao3 + "\nNível da missão: " + nivelDaMissao3);

        System.out.println("––––––––––––––––––––––––––––––––––––––––––");

    }
}

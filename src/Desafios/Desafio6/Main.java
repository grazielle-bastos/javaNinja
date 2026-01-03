package Desafios.Desafio6;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //Iniciar uma LinkedList com 7 ninjas
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        //Adicionar os ninjas na minha LinkedList
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        //Listar os ninjas
        System.out.println(" ----------------- LISTA DE NINJAS ----------------- ");

        //Adicionar o ninja no início da lista
        listaDeNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));

        //Complexidade o(n)
        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        System.out.println(" ----------------- NINJA REMOVIDO ----------------- ");

        //Remover o ninja do início da List
        Ninja removido = listaDeNinjas.removeFirst();
        System.out.println("Ninja removido = " + removido);

        System.out.println(" ----------------- LISTA DE NINJAS ATUALIZADA ----------------- ");

        //Listar os ninjas
        for (Ninja listaDeNinjasAtualizada : listaDeNinjas) {
            System.out.println("Lista de Ninjas depois das mudanças = " + listaDeNinjasAtualizada);
        }

        //Procurar um ninja por índice
        Ninja terceiroNinja = listaDeNinjas.get(2);
        System.out.println("Terceiro ninja = " + terceiroNinja);
    }
}

package NivelIntermediario.Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Array
        String[] ninjasArray = new String[6];

        //Listas
        List<String> ninjasList = new ArrayList<>();

        //Stack
        Stack<String> ninjasStack = new Stack<>();

        //Queue //Filas
        Queue<String> ninjasQueue = new LinkedList<>();

        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Kakashi Hatake");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Hinata Hyuga");

        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjasQueue);

        //Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);

        //Como ver quem é o primeiro
        ninjasQueue.peek();
        System.out.println("Ninja no HEAD: " + ninjasQueue.peek());

        //Adicionar a fila
        ninjasQueue.add("Kiba Inuzuka");
        ninjasQueue.add("Kakashi Hatake");
        System.out.println("Ninjas na fila depois do add: " + ninjasQueue);

        //Não dá pra deletar o tail

        //Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila: " + ninjasQueue);

        //Verificar se está vazia a fila
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }

    }
}

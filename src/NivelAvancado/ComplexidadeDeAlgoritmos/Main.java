package NivelAvancado.ComplexidadeDeAlgoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //O(n) Complexidade linear
        for (int i = 0; i < 29090500; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        inicio = System.nanoTime();
        //Verificar o numero no index
        arrayList.remove(500);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo de execução do ArrayList: " + tempo + " ns");

        inicio = System.nanoTime();
        //Verificar o numero no index do LINKEDLIST
        linkedList.remove(500);

        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("Tempo de execução do LinkedList: " + tempo + " ns");

        //O(1) Complexidade constante
        int a = 100000;
        int b = 10000;
        int solucao = a + b;

        //O(1) Complexidade constante
        int solucaoMultiplicacao = (a + b) * 500;
    }
}

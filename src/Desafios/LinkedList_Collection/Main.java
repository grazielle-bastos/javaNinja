package Desafios.LinkedList_Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Classes
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList.add("Naruto Uzumaki");
        System.out.println("Linked List: " + linkedList);
    }
}

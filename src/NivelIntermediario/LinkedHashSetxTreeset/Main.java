package NivelIntermediario.LinkedHashSetxTreeset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // LinkedHashSet: Ordem de inserção
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Naruto");
        linkedHashSet.add("Sasuke");
        linkedHashSet.add("Sakura");
        linkedHashSet.add("Kakashi");

        System.out.println("LinkedHashSet (Ordem de Inserção):");
        System.out.println(linkedHashSet);

        // TreeSet: Ordem natural
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Naruto");
        treeSet.add("Sasuke");
        treeSet.add("Sakura");
        treeSet.add("Kakashi");

        System.out.println("\nTreeSet (Ordem Natural):");
        System.out.println(treeSet);
    }
}

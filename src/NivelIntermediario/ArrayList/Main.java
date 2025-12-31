package NivelIntermediario.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Array são estáticos, não alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Kakashi Hatake";

        System.out.println("Printando o array de ninjas = " + ninjasArray[0]);

        System.out.println("----------------");

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Printando o array de ninjas = " + ninjasArray[i]);
        }

        System.out.println("----------------");

        //Listas não são estáticas, podem aumentar/ser alteradas
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Kakashi Hatake");
        ninjasList.add("Kiba Inuzuka");

        System.out.println("ninjasList = " + ninjasList);

        ninjasList.remove("Kiba Inuzuka");
        System.out.println("ninjasList = " + ninjasList);

        //Trocar elementos
        ninjasList.set(1, "Kiba Inuzuka");
        System.out.println("ninjasList = " + ninjasList);

        //Ver tamanho lista
        System.out.println("Tamanho Lista = " + ninjasList.size() + " elementos");
    }
}

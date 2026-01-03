package NivelAvancado.IntroducaoANotacaoBigO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //O que é algoritmo?
            //Algoritmo é tudo que resolve um problema

        ArrayList<Ninjas> ninjas = new ArrayList<>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 17));
        ninjas.add(new Ninjas("Sakura Haruno", 17));

        //Algoritmo - O(1) Complexidade Constante
        System.out.println(ninjas.get(2));

        //Algoritmo - O(n) Complexidade Linear
        /*for (Ninjas ninja : ninjas) {
            System.out.println(ninjas);
        }*/

        System.out.println("========================");

        //O(nˆ2) - Complexidade Quadrática
        for (int i = 0; i < ninjas.size(); i++) {
            for(int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + "contra" + ninjas.get(j));
            }
        }



    }
}

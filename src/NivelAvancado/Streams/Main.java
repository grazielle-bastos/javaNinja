package NivelAvancado.Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Kiba Inuzuka", "Konoha", 22));
        ninjas.add(new Ninja("Shikamaru Nara", "Suna", 25));
        ninjas.add(new Ninja("Hinata Hyuga", "Suna", 17));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 17));

        //FILTER - .stream para filtragem dos ninjas por fila
        /*ninjas.stream()
                .filter(ninja -> ninja.getVila().equals("Suna"))
                .forEach(System.out::println); //soutc*/

        //SORTED - Ordenação
        /*ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()) )
                .forEach(System.out::println); //soutc*/

        //Ordenação por nome
        /*ninjas.stream()
                .sorted((n1, n2) -> CharSequence.compare(n1.getNome(), n2.getNome()) )
                .forEach(System.out::println); //soutc*/

        //MAP - Mostrar e mapear um atributo
        /*ninjas.stream()
        .map(Ninja::getNome)
        .forEach(System.out::println);*/

        //MAX - Filtrar por ninja mais velho
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println("Ninja filtrado pelo mais velho = " + ninjaMaisVelho);
    }
}

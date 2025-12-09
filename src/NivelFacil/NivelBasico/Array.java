package NivelFacil.NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja[5]);

        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatakea";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        /*
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";
        System.out.println(nomeNinja);
        */

        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);
    }
}

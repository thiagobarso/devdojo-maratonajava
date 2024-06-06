package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float, e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[77];
        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Vegeta";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Position " + i +": " + nomes[i]);
        }


    }


}

package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numeros01 = 10;
        int numeros02 = 20;
        System.out.println(numeros02 + numeros01 + " Valor " + numeros02 + numeros01);
        double resultado = (double) numeros01 / numeros02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println("21 % 7 " + resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDeferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDeferenteDez "+isDezDeferenteDez);

    }
}

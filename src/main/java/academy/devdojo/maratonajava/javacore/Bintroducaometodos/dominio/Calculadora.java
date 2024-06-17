package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double divideDoisNumeros02(double a, double b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    public double divideDoisNumeros03(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;

    }

    public void imprimeDivisaoDeDoisNumeros(int a, int b) {
        if (b == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(a/b);

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}

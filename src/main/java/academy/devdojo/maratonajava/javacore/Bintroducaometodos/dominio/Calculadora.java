package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNumeros(double a, double b){
        if(b == 0){
            return 0;
        }
        return a/b;
    }

}

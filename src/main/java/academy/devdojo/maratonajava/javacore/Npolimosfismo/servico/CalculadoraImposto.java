package academy.devdojo.maratonajava.javacore.Npolimosfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimosfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do computador");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}

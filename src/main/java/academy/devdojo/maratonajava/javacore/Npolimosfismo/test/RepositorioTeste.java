package academy.devdojo.maratonajava.javacore.Npolimosfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimosfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimosfismo.servico.RepositorioBancoDeDados;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}

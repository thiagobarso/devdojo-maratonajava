package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDiponiveis;

    public RentalService(List<T> objetosDiponiveis) {
        this.objetosDiponiveis = objetosDiponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponível...");
        T t = objetosDiponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDiponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto: " + t);
        objetosDiponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDiponiveis);

    }
}

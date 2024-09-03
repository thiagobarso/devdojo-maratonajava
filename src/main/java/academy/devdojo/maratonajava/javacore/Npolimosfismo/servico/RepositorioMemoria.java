package academy.devdojo.maratonajava.javacore.Npolimosfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimosfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}

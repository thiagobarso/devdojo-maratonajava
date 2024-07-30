package academy.devdojo.maratonajava.javacore.Hherança.test;

import academy.devdojo.maratonajava.javacore.Hherança.dominio.Funcionario;

public class HerancaTest02 {
    /**
     * 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
     * 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
     * 2 - Alocado espaço em memória para o objeto da super classe
     * 3 - Cada atributo de super classe é criado e inicializado com valores default ou o que for passado
     * 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
     * 5 - Construtor é executado da super classe
     * 6 - Alocado espaço em memória para o objeto da sub classe
     * 7 - Cada atributo de sub classe é     criado e inicializado com valores default ou o que for passado da classe pai
     * 8 - Bloco de inicialização da sub classe é executado na ordem em que aparece
     * 9 - Construtor é executado da sub classe
     *
     * */
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");

    }
}

package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder.aPerson()
                .firstName("William")
                .lastName("Suane")
                .username("VitadoNoJiraya")
                .email("william.suane@devdojo.academy")
                .build();
        System.out.println(build);
    }
}

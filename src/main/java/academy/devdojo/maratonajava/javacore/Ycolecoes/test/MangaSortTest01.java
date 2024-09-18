package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Pokémon", 3.2));
        mangas.add(new Manga(3L,"Attack on Titan", 11.20));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}

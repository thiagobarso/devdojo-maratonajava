package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
//        int i = switch (op){
//            case 1,2,3,4,5,6 : yield 100;
//            default: yield 0;
//        };
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name).forEach(p -> System.out.printf("[%d] - %s %d %s%n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }

    public static void delete() {
        System.out.println("Type  the id of the anime you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("Y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    public static void save() {
        System.out.println("Type the name of anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        Integer episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of producers");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime
                .builder()
                .name(name)
                .episodes(episodes)
                .producer(Producer.builder().id(producerId).build())
                .build();
        AnimeRepository.save(anime);
    }

    public static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if(animeOptional.isEmpty()){
            System.out.println("Anime nor found");
            return;
        }
        Anime animeFromDB = animeOptional.get();
        System.out.println("Anime found " + animeFromDB);
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? animeFromDB.getName() : name;

        System.out.println("Type the number of episodes or enter to keep the same");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        name = name.isEmpty() ? animeFromDB.getName() : name;


        Anime animeToUpdate = Anime
                .builder()
                .id(animeFromDB.getId())
                .episodes(episodes)
                .producer(animeFromDB.getProducer())
                .name(name).build();
        AnimeRepository.update(animeToUpdate);
    }
}

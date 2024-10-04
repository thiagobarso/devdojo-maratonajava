package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
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
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name).forEach(p -> System.out.printf("[%d] - %s%n", p.getId(), p.getName()));
    }

    public static void delete() {
        System.out.println("Type  the id of the producer you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("Y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    public static void save() {
        System.out.println("Type the name of producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }
}

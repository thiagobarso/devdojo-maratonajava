package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.domnio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducesRepository;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();
        ProducesRepository.save(producer);
    }
}

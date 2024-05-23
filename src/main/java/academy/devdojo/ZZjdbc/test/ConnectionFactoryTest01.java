package academy.devdojo.ZZjdbc.test;

import academy.devdojo.ZZjdbc.domain.Producer;
import academy.devdojo.ZZjdbc.service.ProducerService;

public class ConnectionFactoryTest01 {

    public static void main(String[] args) {
        Producer producer = Producer.builder().name("NHK").build();
        Producer producerTOUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);
//        ProducerService.delete(2);
        ProducerService.update(producerTOUpdate);
    }
}

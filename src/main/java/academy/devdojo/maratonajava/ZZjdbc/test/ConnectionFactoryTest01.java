package academy.devdojo.maratonajava.ZZjdbc.test;

import academy.devdojo.maratonajava.ZZjdbc.domain.Producer;
import academy.devdojo.maratonajava.ZZjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest01 {

    public static void main(String[] args) {
        Producer producer = Producer.builder().name("NHK").build();
        Producer producerTOUpdate = Producer.builder().id(1).name("MADHOUSE").build();
//        ProducerService.save(producer);
//        ProducerService.delete(2);
//        ProducerService.update(producerTOUpdate);
//        List<Producer> all = ProducerService.findAll();
//        log.info("Producers found '{}'", all);
        ProducerService.showProducerMetadata();
    }
}

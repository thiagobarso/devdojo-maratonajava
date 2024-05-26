package academy.devdojo.ZZjdbc.service;

import academy.devdojo.ZZjdbc.domain.Producer;
import academy.devdojo.ZZjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(int id){
        requiredValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer){
        requiredValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll(){
        return ProducerRepository.findAll();
    }

    public static void showProducerMetadata(){
        ProducerRepository.showProducerMetadata();
    }

    public static void requiredValidId(Integer id){
        if(id == null || id <= 0){
            throw new IllegalArgumentException("Invalid value for id");
        }
    }
}

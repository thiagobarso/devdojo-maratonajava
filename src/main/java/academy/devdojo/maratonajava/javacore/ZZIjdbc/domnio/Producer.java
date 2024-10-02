package academy.devdojo.maratonajava.javacore.ZZIjdbc.domnio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public class Producer {
    Integer id;
    String name;
}

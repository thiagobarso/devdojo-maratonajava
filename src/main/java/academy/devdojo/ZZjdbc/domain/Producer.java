package academy.devdojo.ZZjdbc.domain;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Producer {
    private Integer id;
    private String name;
}

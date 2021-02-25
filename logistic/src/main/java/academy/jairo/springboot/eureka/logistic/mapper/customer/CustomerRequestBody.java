package academy.jairo.springboot.eureka.logistic.mapper.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestBody {

    private String id;
    private String name;

}

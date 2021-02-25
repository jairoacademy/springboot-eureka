package academy.jairo.springboot.eureka.logistic.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee extends BaseDomainAudit {

    private String name;

    private Integer age;

    private BigDecimal wage;

    private Boolean isActive;

    @DBRef
    private Employee boss;

}

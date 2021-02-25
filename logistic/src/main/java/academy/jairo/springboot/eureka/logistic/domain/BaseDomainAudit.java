package academy.jairo.springboot.eureka.logistic.domain;

import lombok.Data;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
public abstract class BaseDomainAudit {

    @Id
    private String id;

    /* TODO: implement this audit user together with security solution
    @CreatedBy
    @Field("created_user")
    private String createdUser;

    @LastModifiedBy
    @Field("updated_user")
    private String updatedUser;
    */

    @CreatedDate
    @Field("created_at")
    private Date createdAt;



    @LastModifiedDate
    @Field("updated_at")
    private Date updatedAt;

}

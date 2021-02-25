package academy.jairo.springboot.eureka.logistic.repository;

import academy.jairo.springboot.eureka.logistic.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

}

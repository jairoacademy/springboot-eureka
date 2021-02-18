package academy.jairo.springboot.eureka.customer.repository;

import academy.jairo.springboot.eureka.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

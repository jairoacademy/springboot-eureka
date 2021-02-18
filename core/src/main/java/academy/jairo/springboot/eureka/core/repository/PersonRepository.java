package academy.jairo.springboot.eureka.core.repository;


import academy.jairo.springboot.eureka.core.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name);
}

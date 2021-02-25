package academy.jairo.springboot.eureka.logistic.repository;

import academy.jairo.springboot.eureka.logistic.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

    @Query("{ $and: [  {'age': { $gte: ?0} }, { 'age': { $lte: ?1} }  ]}")
    public List<Employee> findByMyAgeBetween(Integer in, Integer to);

    public List<Employee> findByAgeBetween(Integer in, Integer to);

}

package academy.jairo.springboot.eureka.logistic.service;

import academy.jairo.springboot.eureka.logistic.domain.Employee;
import academy.jairo.springboot.eureka.logistic.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }

    public Employee findByIdOrThrowBadRequestException(String id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee save(Employee employee) {
        Optional<Employee> bossOptional = Optional.ofNullable(employee.getBoss());
        if (bossOptional.isPresent()) {
            Employee boss = employeeRepository
                    .findById(employee.getBoss().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Chief employee does not exist"));
            employee.setBoss(boss);
        }
        return employeeRepository.save(employee);
    }

    public void replace(Employee employee) {
        findByIdOrThrowBadRequestException(employee.getId());
        employeeRepository.save(employee);
    }

    public void delete(String id) {
        employeeRepository.delete(findByIdOrThrowBadRequestException(id));
    }

}

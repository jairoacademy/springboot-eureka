package academy.jairo.springboot.eureka.customer.service;

import academy.jairo.springboot.eureka.customer.domain.Customer;
import academy.jairo.springboot.eureka.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> listAll(){
        return customerRepository.findAll();
    }

}

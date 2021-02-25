package academy.jairo.springboot.eureka.logistic.service;

import academy.jairo.springboot.eureka.logistic.domain.Customer;
import academy.jairo.springboot.eureka.logistic.mapper.customer.CustomerRequestBody;
import academy.jairo.springboot.eureka.logistic.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> listAll() {
        return customerRepository.findAll();
    }

    public Customer findByIdOrThrowBadRequestException(String id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public void replace(CustomerRequestBody customerRequestBody) {
        Customer customer = findByIdOrThrowBadRequestException(customerRequestBody.getId());
        BeanUtils.copyProperties(customerRequestBody, customer);
        customerRepository.save(customer);
    }

    public void delete(String id) {
        customerRepository.delete(findByIdOrThrowBadRequestException(id));
    }

}

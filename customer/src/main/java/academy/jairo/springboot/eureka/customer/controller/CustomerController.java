package academy.jairo.springboot.eureka.customer.controller;

import academy.jairo.springboot.eureka.customer.domain.Customer;
import academy.jairo.springboot.eureka.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        List<Customer> listCustomers = customerService.listAll();
        return new ResponseEntity<>(listCustomers, HttpStatus.OK);
    }

}

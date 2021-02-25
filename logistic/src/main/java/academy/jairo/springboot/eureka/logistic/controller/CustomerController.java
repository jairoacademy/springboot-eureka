package academy.jairo.springboot.eureka.logistic.controller;

import academy.jairo.springboot.eureka.logistic.domain.Customer;
import academy.jairo.springboot.eureka.logistic.mapper.customer.CustomerRequestBody;
import academy.jairo.springboot.eureka.logistic.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @Operation(
            summary = "List all Customer",
            tags = {"list-customer"})
    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        List<Customer> listCustomers = customerService.listAll();
        return new ResponseEntity<>(listCustomers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable String id) {
        return ResponseEntity.ok(customerService.findByIdOrThrowBadRequestException(id));
    }

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        return new ResponseEntity<Customer>(customerService.save(customer), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody CustomerRequestBody customerRequestBody) {
        customerService.replace(customerRequestBody);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        customerService.delete(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}

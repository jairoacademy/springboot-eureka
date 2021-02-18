package academy.jairo.springboot.eureka.customer.controller;

import academy.jairo.springboot.eureka.customer.domain.Customer;
import academy.jairo.springboot.eureka.customer.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private static CustomerService customerService;

    @Operation(
            summary = "List all Person",
            tags = {"list-person"})
    @GetMapping
    public ResponseEntity<List<Customer>> findAll() {
        log.info("Listing Person");
        return new ResponseEntity<>(customerService.listAll(), HttpStatus.OK);
    }

}

package academy.jairo.springboot.eureka.logistic.mapper.customer;

import academy.jairo.springboot.eureka.logistic.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CustomerMapper {
    public static final CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);
    public abstract Customer toCustomer(Customer customer);
    public abstract Customer toCustomer(CustomerRequestBody customerRequestBody);
}

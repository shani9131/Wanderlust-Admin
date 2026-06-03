package com.travel.jar.controller;
import java.util.List;
import com.travel.jar.model.Customer;
import com.travel.jar.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin("*") // Yeh aapke HTML/JS frontend ko is backend se baat karne ki permission deta hai
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    // Yeh endpoint naya customer database mein save karega
    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Customer Added Successfully!";
    }
    // Yeh endpoint database se saare customers fetch karega
    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll(); // 'findAll()' bina SQL likhe SELECT * FROM customer chala dega
    }
}
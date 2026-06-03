package com.travel.jar.repository;

import com.travel.jar.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
    // Ye 1 line ka code automatically aapki saari INSERT, UPDATE, DELETE queries generate kar dega!
}
package com.osc.dddspring.infra;

import com.osc.object.chapter05.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    Optional<Customer> findById(String id);
}

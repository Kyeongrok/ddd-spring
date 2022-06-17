package com.osc.dddspring.infra;

import com.osc.dddspring.domain.Customer;

public interface CustomerRepository {

    Customer findById(String id);
}

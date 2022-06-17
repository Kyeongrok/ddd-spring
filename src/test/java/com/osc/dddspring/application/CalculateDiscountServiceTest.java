package com.osc.dddspring.application;

import com.osc.dddspring.exceptions.NoCustomerException;
import com.osc.dddspring.infra.CustomerRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculateDiscountServiceTest {

    @Test
    void noCustomer_thenExceptionShouldBeThrown() {
        //
        CustomerRepository stubRepo = mock(CustomerRepository.class);
        when(stubRepo.findById("noCustId")).thenReturn(null);

        RuleDiscounter stubRule = (cust, lines) -> null;

        CalculateDiscountService calDisSvc = new CalculateDiscountService(stubRepo, stubRule);
        assertThrows(NoCustomerException.class, () -> calDisSvc.calculateDiscount(new ArrayList<>(), "noCustId"));
    }
}
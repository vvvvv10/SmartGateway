package com.alibaba.demo.domain.customer.gateway;

import com.alibaba.demo.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}

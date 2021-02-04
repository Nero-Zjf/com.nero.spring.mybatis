package com.nero.spring.mybatis.mapper;


import com.nero.spring.mybatis.domain.Customer;

import java.util.List;

public interface CustomerMapper {
    int addCustomer(Customer customer);

    int addCustomer2(Customer customer);

    int updCustomer(Customer customer);

    int delCustomerById(long custId);

    Customer getCustomerById(long custId);

    List<Customer> getCustomerByNameSex(String name, int sex);
}

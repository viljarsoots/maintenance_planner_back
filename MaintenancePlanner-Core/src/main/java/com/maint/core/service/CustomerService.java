package com.maint.core.service;


import com.maint.core.beans.CustomerDto;
import com.maint.core.dao.CustomerDao;
import com.maint.core.exceptions.CustomerrException;
import com.maint.core.model.Customer;
import com.maint.core.utils.BeanUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@Transactional
public class CustomerService {

    @Autowired

    private CustomerDao customerDao;

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<Customer> findById(Long id) {
        if (!(customerDao.findById(id).isPresent())){
            throw new CustomerrException("Customer was not found!");
        } else {
            return Optional.of(customerDao.findById(id).get());

        }
    }

    public void save(CustomerDto customerDto) throws IOException {

        Customer customer = null;
        if(customerDto.getId() != null){
            Optional<Customer> optionalCustomer = findById(customerDto.getId());
            if(optionalCustomer.isPresent()){
                customer = optionalCustomer.get();
                updateCustomer(customer, customerDto);
            }
        }else {
            customer = BeanUtils.dto2Model(customerDto);

        }
        customerDao.save(customer);
    }

    public void updateCustomer(Customer customer, CustomerDto customerDto){
        customer.setId(customerDto.getId());
        customer.setName(customerDto.getName());
        customer.setAddress(customerDto.getAddress());
        customer.setLocation(customerDto.getLocation());


        customerDao.save(customer);
    }

    @Transactional
    public List<Customer> findAll() {
        return customerDao.findAll();
    }



}

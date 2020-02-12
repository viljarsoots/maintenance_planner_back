package com.maint.core.dao;


import com.maint.core.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao  extends JpaRepository<Customer, Long> {

    Customer findCustomerById(Long id);

}

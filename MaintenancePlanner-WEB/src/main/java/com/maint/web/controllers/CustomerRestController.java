package com.maint.web.controllers;


import com.maint.core.beans.CustomerDto;
import com.maint.core.model.Customer;
import com.maint.core.service.CustomerService;
import com.maint.web.beans.ResponseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/rest")
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customer/save", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<String> moduleProcess(@RequestBody CustomerDto customerDto) throws IOException {

        customerService.save(customerDto);
        return new ResponseBean<>("Customer Saved");
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<List<Customer>> findAll() {
        List<Customer> customers = customerService.findAll();
        return new ResponseBean<List<Customer>>(customers);

    }
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseBean<Optional<Customer>> find(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        return new ResponseBean<Optional<Customer>>(customer);
    }

}

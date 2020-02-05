package com.maint.web.controllers;

//import com.knits.tms.beans.EmployeeDto;
//import com.knits.tms.beans.EmployeeSearchDto;
//import com.knits.tms.model.Employee;
//import com.knits.tms.service.EmployeeService;
//import com.knits.tms.util.BeanMappingUtils;
import com.maint.web.beans.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@Slf4j
@CrossOrigin
@RequestMapping("/rest/employee")
public class EmployeeRestController {

//    @Autowired
//    private EmployeeService employeeService;
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes= MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> moduleProcess(@RequestBody EmployeeDto employeeDto) {
//        employeeService.saveEmployee(employeeDto);
//        return new ResponseBean<>("Employee Saved");
//    }
//
//    @RequestMapping(value = "/filtered", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<List<EmployeeDto>> moduleProcess(@RequestBody EmployeeSearchDto employeeSearchDto) {
//        log.info("EmployeeSearchDto: " + employeeSearchDto);
//        List<Employee> employees = employeeService.searchEmployees(employeeSearchDto);
//        List<EmployeeDto> dtos = new ArrayList<>();
//        for (Employee employee: employees) {
//            dtos.add(BeanMappingUtils.model2Dto(employee));
//        }
//        log.info(dtos.toString());
//        return new ResponseBean<>(dtos);
//
//    }
//    @RequestMapping(value = "/deactivate/{id}", method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<String> deActivateAccount(@PathVariable("id") Long id) {
//        employeeService.deActivate(id);
//        return new ResponseBean<String>();
//    }
//
//    @RequestMapping(value = "/{id}",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//        ResponseBean<EmployeeDto> findEmployee(@PathVariable("id") Long id) {
//        EmployeeDto dto = employeeService.findById(id);
//        if(dto!=null){
//            return new ResponseBean<EmployeeDto>(dto);
//        }
//        return new ResponseBean<EmployeeDto>("No Employee found for id "+id,false,null);
//    }
//
//
//    @RequestMapping(value = "/edit", method = RequestMethod.POST,
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<EmployeeDto> editEmployee(@RequestBody EmployeeDto employeeDto) {
//        employeeService.saveEmployee(employeeDto);
//        return new ResponseBean<>("Employee Updated");
//    }
//
//
//    @RequestMapping(value = "/search", method = RequestMethod.POST,
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes= MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody
//    ResponseBean<List<EmployeeDto>> employeeFind(@RequestBody EmployeeSearchDto employeeSearchDto) {
//        log.info("Received employee " + employeeSearchDto);
//        List<Employee> employees = employeeService.searchEmployees(employeeSearchDto);
//        log.info("Found employees: " + employees);
//        List<EmployeeDto> employeeDtos = new ArrayList<>();
//        for (Employee employee: employees) {
//            employeeDtos.add(BeanMappingUtils.model2Dto(employee));
//        }
//
//        return new ResponseBean<List<EmployeeDto>>(employeeDtos);
//    }

}

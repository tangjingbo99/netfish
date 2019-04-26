package com.auspex.workday.controller;

import com.auspex.workday.dao.model.Employee;
import com.auspex.workday.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee",method = RequestMethod.POST)
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value = "/select/{id}")
    public Employee selectEmployeeById(@PathVariable("id") int id){
        return employeeService.selectEmployee(id);
    }

    @ResponseBody
    @RequestMapping(value = "/test/{param}")
    public String test(@PathVariable("param") String param){
        return "hi," + param;
    }

}

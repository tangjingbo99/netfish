package com.auspex.workday.service;

import com.auspex.workday.dao.mapper.EmployeeMapper;
import com.auspex.workday.dao.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public Employee selectEmployee(int id){

        return employeeMapper.select(id);
    }

}

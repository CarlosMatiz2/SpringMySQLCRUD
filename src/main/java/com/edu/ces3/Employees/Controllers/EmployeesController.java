package com.edu.ces3.Employees.Controllers;

import com.edu.ces3.Employees.DAO.EmployeeDAO;
import com.edu.ces3.Employees.Models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeesController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping(value = "test")
    public String test() {
        return "Hola Spring Boot";
    }

    @RequestMapping(value = "api/employees", method = RequestMethod.GET)
    public List<Employee> getEmployees(){
        return employeeDAO.getEmployees();
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("id") int id){
        return employeeDAO.getEmployee(id);
    }

    @RequestMapping(value = "api/employee", method = RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeDAO.createEmployee(employee);
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.PUT)
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee){
        return employeeDAO.updateEmployee(id, employee);
    }

    @RequestMapping(value = "api/employee/{id}", method = RequestMethod.DELETE)
    public Employee deleteEmployee(@PathVariable("id") int id){
        return employeeDAO.deleteEmployee(id);
    }

}

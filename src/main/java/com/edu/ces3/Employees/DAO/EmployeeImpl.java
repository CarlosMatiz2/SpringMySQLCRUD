package com.edu.ces3.Employees.DAO;

import com.edu.ces3.Employees.Models.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeImpl implements EmployeeDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List getEmployees() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public Employee getEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        employee.setId(id);
        return entityManager.merge(employee);
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
        return employee;
    }
}

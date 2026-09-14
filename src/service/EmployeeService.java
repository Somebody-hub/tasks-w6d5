package service;

import model.Employee;

import java.util.*;

public class EmployeeService <T extends Employee> {
    private final Map<Integer, T> allEmployee = new HashMap<>();

    public void addEmployee(T employee) {
        allEmployee.put(employee.getId(), employee);
    }

    public T getEmpById(int id){
        return allEmployee.get(id);
    }

}

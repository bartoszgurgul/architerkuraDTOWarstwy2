package main.structuralpattern.adapter;

import main.structuralpattern.adapter.dto.Employee;

import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient employeeClient = new EmployeeClient();
        List<Employee> empoyeeList = employeeClient.getEmployeeList();
        System.out.println(empoyeeList);
    }
}

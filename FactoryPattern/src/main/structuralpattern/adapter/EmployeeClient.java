package main.structuralpattern.adapter;

import main.structuralpattern.adapter.adapter.EmpoyeeAdapterDtoCSV;
import main.structuralpattern.adapter.adapter.EmpoyeeAdapterDtoLdap;
import main.structuralpattern.adapter.dto.Employee;
import main.structuralpattern.adapter.dto.EmployeeDtoDB;
import main.structuralpattern.adapter.dto.EmpoyeeCSVDto;
import main.structuralpattern.adapter.dto.EmpoyeeDtoLDAP;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeDB = new EmployeeDtoDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeDB);

        EmpoyeeDtoLDAP empoyeeDtoLDAP = new EmpoyeeDtoLDAP("chewi", "Solo", "Han", "han@solo.star");
        employees.add( new EmpoyeeAdapterDtoLdap(empoyeeDtoLDAP));

        EmpoyeeCSVDto empoyeeCSVDto = new EmpoyeeCSVDto("567,Sherlock,Holmes'sherloc@london.com");
        employees.add( new EmpoyeeAdapterDtoCSV(empoyeeCSVDto));

        return employees;


    }
}

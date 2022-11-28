package main.structuralpattern.adapter.adapter;

import main.structuralpattern.adapter.dto.Employee;
import main.structuralpattern.adapter.dto.EmpoyeeCSVDto;

public class EmpoyeeAdapterDtoCSV implements Employee {
    private EmpoyeeCSVDto empoyeeCSVDto;

    public EmpoyeeAdapterDtoCSV(EmpoyeeCSVDto empoyeeCSVDto) {
        this.empoyeeCSVDto = empoyeeCSVDto;
    }

    @Override
    public String getId() {
        return String.valueOf(empoyeeCSVDto.getId());
    }

    @Override
    public String getFirstName() {
        return empoyeeCSVDto.getFirstName();
    }

    @Override
    public String getLastName() {
        return empoyeeCSVDto.getLastName();
    }

    @Override
    public String getEmail() {
        return empoyeeCSVDto.getEmailAdress();
    }
}

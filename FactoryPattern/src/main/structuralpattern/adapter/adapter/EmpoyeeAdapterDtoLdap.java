package main.structuralpattern.adapter.adapter;

import main.structuralpattern.adapter.dto.Employee;
import main.structuralpattern.adapter.dto.EmpoyeeDtoLDAP;

public class EmpoyeeAdapterDtoLdap implements Employee {

    private EmpoyeeDtoLDAP instance;

    public EmpoyeeAdapterDtoLdap(EmpoyeeDtoLDAP instance) {
        this.instance = instance;
    }


    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }


}

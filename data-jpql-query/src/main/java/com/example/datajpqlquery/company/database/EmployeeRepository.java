package com.example.datajpqlquery.company.database;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Query("select e from Employee e where e.salary>1000")
    List<Employee> findRichEmployees();

    @Query("update Employee e set e.salary = e.salary+100")
    @Modifying
    @Transactional
    void giveRiseToAll();

    @Query("select e from Employee e where e.salary>:min and e.salary<:max")
    List<Employee> findBySalaryInRange(double min, double max);
}

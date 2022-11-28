package com.example.datajpqlquery;

import com.example.datajpqlquery.company.database.Employee;
import com.example.datajpqlquery.company.database.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DataJpqlQueryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataJpqlQueryApplication.class, args);
        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        employeeRepository.save(new Employee("Jan", "Zenkiewicz", 2000.0));
        employeeRepository.save(new Employee("Marta", "Dudek", 13000.0));
        employeeRepository.save(new Employee("Paweł", "Adamczyk", 12500.0));
        employeeRepository.save(new Employee("Kasia", "Kowalska", 4000.0));

        System.out.println(">>> Pracownicy po podwyżce:");
        employeeRepository.giveRiseToAll();
        employeeRepository.findAll().forEach(System.out::println);

        System.out.println(">>> Bogaci pracownicy:");
        employeeRepository.findRichEmployees().forEach(System.out::println);

        System.out.println(">>> Pracownicy zarabiający pomiędzy 3000zł i 5000zł");
        employeeRepository.findBySalaryInRange(3000, 5000).forEach(System.out::println);


    }

}

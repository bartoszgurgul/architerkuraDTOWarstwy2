package pl.javastart.architerkuradtowarstwy.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String city;
    private Integer employees;
    private String telephone;
    private String email;
    @OneToMany( mappedBy = "company", cascade = CascadeType.REMOVE)
    private List<JobOffer> jobOfferList = new ArrayList<>();

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", city='" + city + '\'' +
                ", employees=" + employees +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", jobOfferList=" + jobOfferList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public Company setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Company setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Company setCity(String city) {
        this.city = city;
        return this;
    }

    public Integer getEmployees() {
        return employees;
    }

    public Company setEmployees(Integer employees) {
        this.employees = employees;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public Company setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Company setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<JobOffer> getJobOfferList() {
        return jobOfferList;
    }

    public Company setJobOfferList(List<JobOffer> jobOfferList) {
        this.jobOfferList = jobOfferList;
        return this;
    }

    public Company(String name, String description, String city, Integer employees, String telephone, String email, List<JobOffer> jobOfferList) {
        this.name = name;
        this.description = description;
        this.city = city;
        this.employees = employees;
        this.telephone = telephone;
        this.email = email;
        this.jobOfferList = jobOfferList;
    }

    public Company() {
    }
}

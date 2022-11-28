package pl.javastart.architerkuradtowarstwy.dto;

public class CompanyDto {
    private Long id;
    private String name;
    private String description;
    private String city;
    private Integer employees;
    private String telephone;
    private String email;

    public Long getId() {
        return id;
    }

    public CompanyDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CompanyDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CompanyDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getCity() {
        return city;
    }

    public CompanyDto setCity(String city) {
        this.city = city;
        return this;
    }

    public Integer getEmployees() {
        return employees;
    }

    public CompanyDto setEmployees(Integer employees) {
        this.employees = employees;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public CompanyDto setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CompanyDto setEmail(String email) {
        this.email = email;
        return this;
    }
}

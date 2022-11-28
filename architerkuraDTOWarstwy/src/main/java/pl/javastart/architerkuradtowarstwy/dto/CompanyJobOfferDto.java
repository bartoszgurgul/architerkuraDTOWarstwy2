package pl.javastart.architerkuradtowarstwy.dto;

public class CompanyJobOfferDto {
    private Long id;
    private String title;
    private Double maxSalary;
    private Double minSalary;
    private String location;

    public Long getId() {
        return id;
    }

    public CompanyJobOfferDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public CompanyJobOfferDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public CompanyJobOfferDto setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
        return this;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public CompanyJobOfferDto setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public CompanyJobOfferDto setLocation(String location) {
        this.location = location;
        return this;
    }
}

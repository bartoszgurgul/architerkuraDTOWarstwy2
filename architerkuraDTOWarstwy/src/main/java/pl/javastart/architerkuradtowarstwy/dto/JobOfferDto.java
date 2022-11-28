package pl.javastart.architerkuradtowarstwy.dto;

import java.time.LocalDateTime;

public class JobOfferDto {
    private Long id;
    private String title;
    private String description;
    private String requirements;
    private String duties;
    private String location;
    private Double minSalary;
    private Double maxSalary;
    private LocalDateTime dateAdded;
    private Long companyId;
    private String companyName;

    public Long getId() {
        return id;
    }

    public JobOfferDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public JobOfferDto setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public JobOfferDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRequirements() {
        return requirements;
    }

    public JobOfferDto setRequirements(String requirements) {
        this.requirements = requirements;
        return this;
    }

    public String getDuties() {
        return duties;
    }

    public JobOfferDto setDuties(String duties) {
        this.duties = duties;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public JobOfferDto setLocation(String location) {
        this.location = location;
        return this;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public JobOfferDto setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
        return this;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public JobOfferDto setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
        return this;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public JobOfferDto setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public JobOfferDto setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public JobOfferDto setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
}

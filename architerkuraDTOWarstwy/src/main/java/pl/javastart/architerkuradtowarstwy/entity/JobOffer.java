package pl.javastart.architerkuradtowarstwy.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class JobOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String requirements;
    private String duties;
    private String location;
    private Double minSalary;
    private Double maxSalary;
    private LocalDateTime dateAdded;
    private Integer submissions;
    @ManyToOne(optional = false)
    @JoinColumn(name = "company_id")
    private Company company;

    @Override
    public String toString() {
        return "JobOffer{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", requirements='" + requirements + '\'' +
                ", duties='" + duties + '\'' +
                ", locations='" + location + '\'' +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", dateAdded=" + dateAdded +
                ", submissons=" + submissions +
                ", company=" + company +
                '}';
    }

    public Long getId() {
        return id;
    }

    public JobOffer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public JobOffer setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public JobOffer setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getRequirements() {
        return requirements;
    }

    public JobOffer setRequirements(String requirements) {
        this.requirements = requirements;
        return this;
    }

    public String getDuties() {
        return duties;
    }

    public JobOffer setDuties(String duties) {
        this.duties = duties;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public JobOffer setLocation(String locations) {
        this.location = locations;
        return this;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public JobOffer setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
        return this;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public JobOffer setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
        return this;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public JobOffer setDateAdded(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
        return this;
    }

    public Integer getSubmissions() {
        return submissions;
    }

    public JobOffer setSubmissions(Integer submissons) {
        this.submissions = submissons;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public JobOffer setCompany(Company company) {
        this.company = company;
        return this;
    }

    public JobOffer(String title, String description, String requirements, String duties, String locations, Double minSalary, Double maxSalary, LocalDateTime dateAdded, Integer submissons, Company company) {
        this.title = title;
        this.description = description;
        this.requirements = requirements;
        this.duties = duties;
        this.location = locations;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.dateAdded = dateAdded;
        this.submissions = submissons;
        this.company = company;
    }

    public JobOffer() {
    }
}

package pl.javastart.architerkuradtowarstwy.mapper;

import org.springframework.stereotype.Service;
import pl.javastart.architerkuradtowarstwy.dto.JobOfferDto;
import pl.javastart.architerkuradtowarstwy.entity.Company;
import pl.javastart.architerkuradtowarstwy.entity.JobOffer;
import pl.javastart.architerkuradtowarstwy.repository.CompanyRepository;

import java.util.Collections;
import java.util.function.Function;

@Service
public class JobOfferDtoMapper {
    private final CompanyRepository companyRepository;

    public JobOfferDtoMapper(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public JobOfferDto map(JobOffer jobOffer){
        return new JobOfferDto()
                .setId(jobOffer.getId())
                .setTitle(jobOffer.getTitle())
                .setDescription(jobOffer.getDescription())
                .setRequirements(jobOffer.getRequirements())
                .setDuties(jobOffer.getDuties())
                .setLocation(jobOffer.getLocation())
                .setMinSalary(jobOffer.getMinSalary())
                .setMaxSalary(jobOffer.getMaxSalary())
                .setDateAdded(jobOffer.getDateAdded())
                .setCompanyId(jobOffer.getCompany().getId())
                .setCompanyName(jobOffer.getCompany().getName());
    }

    public JobOffer map(JobOfferDto jobOfferDto){
        JobOffer jobOffer = new JobOffer()
                .setId(jobOfferDto.getId())
                .setTitle(jobOfferDto.getTitle())
                .setDescription(jobOfferDto.getDescription())
                .setRequirements(jobOfferDto.getRequirements())
                .setDuties(jobOfferDto.getDuties())
                .setLocation(jobOfferDto.getLocation())
                .setMinSalary(jobOfferDto.getMinSalary())
                .setMaxSalary(jobOfferDto.getMaxSalary())
                .setDateAdded(jobOfferDto.getDateAdded());
        companyRepository.findById(jobOfferDto.getCompanyId())
                .ifPresent(jobOffer::setCompany);
        return jobOffer;

    }
}

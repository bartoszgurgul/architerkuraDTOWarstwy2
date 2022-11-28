package pl.javastart.architerkuradtowarstwy.mapper;

import org.springframework.stereotype.Service;
import pl.javastart.architerkuradtowarstwy.dto.CompanyJobOfferDto;
import pl.javastart.architerkuradtowarstwy.entity.JobOffer;

@Service
public class CompanyJobOfferDtoMapper {
    public CompanyJobOfferDto map(JobOffer jobOffer){
        return new CompanyJobOfferDto()
                .setId(jobOffer.getId())
                .setTitle(jobOffer.getTitle())
                .setMaxSalary(jobOffer.getMaxSalary())
                .setMinSalary(jobOffer.getMinSalary())
                .setLocation(jobOffer.getLocation());
    }
}

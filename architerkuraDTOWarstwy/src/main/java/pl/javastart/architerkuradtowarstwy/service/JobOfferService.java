package pl.javastart.architerkuradtowarstwy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.javastart.architerkuradtowarstwy.dto.JobOfferDto;
import pl.javastart.architerkuradtowarstwy.entity.JobOffer;
import pl.javastart.architerkuradtowarstwy.mapper.JobOfferDtoMapper;
import pl.javastart.architerkuradtowarstwy.repository.JobOfferRepository;

import java.util.Optional;

@Service
public class JobOfferService {
    private final JobOfferRepository jobOfferRepository;
    private final JobOfferDtoMapper jobOfferDtoMapper;

    @Autowired
    public JobOfferService(JobOfferRepository jobOfferRepository, JobOfferDtoMapper jobOfferDtoMapper) {
        this.jobOfferRepository = jobOfferRepository;
        this.jobOfferDtoMapper = jobOfferDtoMapper;
    }

    public Optional<JobOfferDto> getOfferById(Long id) {
        return jobOfferRepository.findById(id).map(jobOfferDtoMapper::map);
    }

    public JobOfferDto saveJobOffer(JobOfferDto jobOfferDto){
        JobOffer jobOffer = jobOfferDtoMapper.map(jobOfferDto);
        JobOffer savedJobOffer = jobOfferRepository.save(jobOffer);
        return jobOfferDtoMapper.map(savedJobOffer);
    }

    @Transactional
    public Optional<JobOfferDto> updateJobOffer(Long id, JobOfferDto jobOfferDto){
        return jobOfferRepository.findById(id)
                .map(jobOffer -> setEntityFields(jobOfferDto, jobOffer))
                .map(jobOfferDtoMapper::map);
        
    }

    public Boolean deleteJobOffer(Long id){
        return jobOfferRepository.findById(id).map(jobOffer -> {
            jobOfferRepository.delete(jobOffer);
            return true;
        }).orElse(false);
    }

    private JobOffer setEntityFields(JobOfferDto sourceJobOffer, JobOffer targetJobOffer) {
        if (sourceJobOffer.getTitle()!=null)
            targetJobOffer.setTitle(sourceJobOffer.getTitle());
        if (sourceJobOffer.getDescription()!=null)
            targetJobOffer.setDescription(targetJobOffer.getDescription());
        if (sourceJobOffer.getRequirements()!=null)
            targetJobOffer.setRequirements(sourceJobOffer.getRequirements());
        if (sourceJobOffer.getDuties()!=null)
            targetJobOffer.setDuties(sourceJobOffer.getDuties());
        if (sourceJobOffer.getLocation()!=null)
            targetJobOffer.setLocation(sourceJobOffer.getLocation());
        if (sourceJobOffer.getMinSalary()!=0)
            targetJobOffer.setMinSalary(sourceJobOffer.getMinSalary());
        if (sourceJobOffer.getMaxSalary()!=0)
            targetJobOffer.setMaxSalary(sourceJobOffer.getMaxSalary());
        return targetJobOffer;
    }
}

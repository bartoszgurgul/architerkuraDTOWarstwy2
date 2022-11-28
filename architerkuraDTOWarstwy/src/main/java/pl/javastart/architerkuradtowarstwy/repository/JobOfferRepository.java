package pl.javastart.architerkuradtowarstwy.repository;

import org.springframework.data.repository.CrudRepository;
import pl.javastart.architerkuradtowarstwy.entity.JobOffer;

public interface JobOfferRepository extends CrudRepository<JobOffer, Long> {
}

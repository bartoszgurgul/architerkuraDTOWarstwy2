package pl.javastart.architerkuradtowarstwy.repository;

import org.springframework.data.repository.CrudRepository;
import pl.javastart.architerkuradtowarstwy.entity.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}

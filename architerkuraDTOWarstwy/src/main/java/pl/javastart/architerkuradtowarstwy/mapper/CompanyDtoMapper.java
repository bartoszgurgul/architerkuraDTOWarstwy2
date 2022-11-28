package pl.javastart.architerkuradtowarstwy.mapper;

import org.springframework.stereotype.Service;
import pl.javastart.architerkuradtowarstwy.dto.CompanyDto;
import pl.javastart.architerkuradtowarstwy.entity.Company;

@Service
public class CompanyDtoMapper {
    public CompanyDto map(Company company){
        return new CompanyDto()
                .setId(company.getId())
                .setName(company.getName())
                .setDescription(company.getDescription())
                .setCity(company.getCity())
                .setEmail(company.getEmail())
                .setEmployees(company.getEmployees())
                .setTelephone(company.getTelephone());
    }

    public Company map(CompanyDto companyDto){
        return new Company()
                .setId(companyDto.getId())
                .setName(companyDto.getName())
                .setDescription(companyDto.getDescription())
                .setCity(companyDto.getCity())
                .setEmployees(companyDto.getEmployees())
                .setTelephone(companyDto.getTelephone())
                .setEmail(companyDto.getEmail());
    }
}

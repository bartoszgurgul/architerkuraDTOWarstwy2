package pl.javastart.architerkuradtowarstwy.service;

import org.springframework.stereotype.Service;
import pl.javastart.architerkuradtowarstwy.dto.CompanyDto;
import pl.javastart.architerkuradtowarstwy.dto.CompanyJobOfferDto;
import pl.javastart.architerkuradtowarstwy.entity.Company;
import pl.javastart.architerkuradtowarstwy.mapper.CompanyDtoMapper;
import pl.javastart.architerkuradtowarstwy.mapper.CompanyJobOfferDtoMapper;
import pl.javastart.architerkuradtowarstwy.repository.CompanyRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final CompanyDtoMapper companyDtoMapper;
    private final CompanyJobOfferDtoMapper companyJobOfferDtoMapper;

    public CompanyService(CompanyRepository companyRepository, CompanyDtoMapper companyDtoMapper, CompanyJobOfferDtoMapper jobOfferDtoMapper) {
        this.companyRepository = companyRepository;
        this.companyDtoMapper = companyDtoMapper;
        this.companyJobOfferDtoMapper = jobOfferDtoMapper;
    }

    public Optional<CompanyDto> getCompanyById(Long id) {
        return companyRepository.findById(id).map(companyDtoMapper::map);
    }

    public List<CompanyJobOfferDto> getJobOfferByCompany(Long id){
        return companyRepository.findById(id)
                .map(Company::getJobOfferList)
                .orElse(Collections.emptyList())
                .stream()
                .map(companyJobOfferDtoMapper::map)
                .collect(Collectors.toList());
    }

    public CompanyDto saveCompany(CompanyDto companyDto){
        Company company = companyDtoMapper.map(companyDto);
        Company savedCompany = companyRepository.save(company); // po zapisie otrzymujemy identyfikator ktory mozemy
        // dalej przekazac w odpowiedzi
        return companyDtoMapper.map(savedCompany);
    }

    public Optional<CompanyDto> updateCompany(Long id, CompanyDto companyDto ){
        if (companyRepository.findById(id).isEmpty())
            return Optional.empty();
        companyDto.setId(id);
        Company company = companyDtoMapper.map(companyDto);
        Company savedCompany = companyRepository.save(company);
        return Optional.of(companyDtoMapper.map(savedCompany));
    }

    public Boolean deleteCompany(Long id){
        return companyRepository.findById(id)
                .map( company -> {
                    companyRepository.delete(company);
                    return true;
                })
                .orElse(false);
    }
}

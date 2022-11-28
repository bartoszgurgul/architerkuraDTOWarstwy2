package pl.javastart.architerkuradtowarstwy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.javastart.architerkuradtowarstwy.dto.CompanyDto;
import pl.javastart.architerkuradtowarstwy.dto.CompanyJobOfferDto;
import pl.javastart.architerkuradtowarstwy.service.CompanyService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDto> getCompanyById(@PathVariable Long id){
        return companyService.getCompanyById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/offers")
    public ResponseEntity<List<CompanyJobOfferDto>> getJobOfferByCompany(@PathVariable Long id){
        if (companyService.getCompanyById(id).isEmpty())
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok(companyService.getJobOfferByCompany(id));
    }

    @PostMapping
    public ResponseEntity<CompanyDto> saveCompany(@RequestBody CompanyDto companyDto){
        CompanyDto savedCompanyDto = companyService.saveCompany(companyDto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedCompanyDto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(savedCompanyDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCompany(@PathVariable Long id, @RequestBody CompanyDto companyDto){
        return companyService.updateCompany(id, companyDto)
                .map(companyDto1 -> ResponseEntity.noContent().build())
                .orElse(ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCompany(@PathVariable Long id){
        return companyService.deleteCompany(id)
                ?ResponseEntity.noContent().build()
                :ResponseEntity.notFound().build();
    }

}

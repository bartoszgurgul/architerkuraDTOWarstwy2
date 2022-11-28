package pl.javastart.architerkuradtowarstwy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pl.javastart.architerkuradtowarstwy.dto.JobOfferDto;
import pl.javastart.architerkuradtowarstwy.service.JobOfferService;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/offers")
public class JobOfferController {
    private final JobOfferService jobOfferService;

    @Autowired
    public JobOfferController(JobOfferService jobOfferService) {
        this.jobOfferService = jobOfferService;
    }

    @GetMapping("{id}")
    ResponseEntity<JobOfferDto> getOfferById(@PathVariable Long id) {
        return jobOfferService.getOfferById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<JobOfferDto> saveJobOffer(@RequestBody JobOfferDto jobOfferDto) {
        JobOfferDto savedJobOfferDto = jobOfferService.saveJobOffer(jobOfferDto);
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}").buildAndExpand(savedJobOfferDto.getId())
                .toUri();
        return ResponseEntity.created(uri).body(savedJobOfferDto);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateJobOffer(@PathVariable Long id, @RequestBody JobOfferDto jobOfferDto){
        return jobOfferService.updateJobOffer(id, jobOfferDto)
                .map(patchJobOffer -> ResponseEntity.noContent().build() )
                .orElse(ResponseEntity.notFound().build());

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteJobOffer(@PathVariable Long id){
        return jobOfferService.deleteJobOffer(id)?ResponseEntity.noContent().build():ResponseEntity.notFound().build();
    }
}

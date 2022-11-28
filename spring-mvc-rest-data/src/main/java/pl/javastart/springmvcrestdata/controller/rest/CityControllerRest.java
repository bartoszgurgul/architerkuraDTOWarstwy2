package pl.javastart.springmvcrestdata.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.javastart.springmvcrestdata.model.City;
import pl.javastart.springmvcrestdata.repository.CityRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/cities")
public class CityControllerRest {

    private CityRepository cityRepository;

    @Autowired
    public CityControllerRest(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<City> getCities(
                @RequestParam(required = false, defaultValue = "name")String orderBySth,
                @RequestParam(required = false, defaultValue = "10")int limit) {
        List<City> cityRepositoryAll = cityRepository.findAll();
        if ("name".equals(orderBySth)){
            cityRepositoryAll.sort(Comparator.comparing(City::getName));
        } else if ("population".equals(orderBySth)){
            cityRepositoryAll.sort(Comparator.comparing(City::getPopulation));
        }
        return cityRepositoryAll.stream().limit(limit).collect(Collectors.toList());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<City> getCity(@PathVariable long id){
        return cityRepository.findById(id)
                .map( ResponseEntity::ok).orElseGet(() ->ResponseEntity.notFound().build());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveCity(@RequestBody City city){

        cityRepository.save(city);
    }
}

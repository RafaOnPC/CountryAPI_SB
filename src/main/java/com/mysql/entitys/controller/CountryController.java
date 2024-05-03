package com.mysql.entitys.controller;

import com.mysql.entitys.dto.CountryDTO;
import com.mysql.entitys.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("country/{countryId}")
    public ResponseEntity<CountryDTO> getCountry(@PathVariable Long countryId){
        return new ResponseEntity<>(countryService.getCountry(countryId), HttpStatus.OK);
    }

    @GetMapping("/country")
    public ResponseEntity<List<CountryDTO>> getCountrys(){
        return new ResponseEntity<>(countryService.getCountrys(), HttpStatus.OK);
    }

    @PostMapping("/country")
    public ResponseEntity<CountryDTO> storeCountry(@RequestBody CountryDTO countryDTO){
        return new ResponseEntity<>(countryService.saveCountryDTO(countryDTO), HttpStatus.CREATED);
    }

    @PatchMapping("/country/{countryId}")
    public ResponseEntity<CountryDTO> updateCountry(@PathVariable Long countryId, @RequestBody CountryDTO countryDTO){
        return new ResponseEntity<>(countryService.updateCountryEntity(countryId,countryDTO), HttpStatus.OK);
    }

    @DeleteMapping("/country/{countryId}")
    public ResponseEntity<CountryDTO> deleteCountry(@PathVariable Long countryId){
        return new ResponseEntity<>(countryService.deleteCountry(countryId), HttpStatus.OK);
    }

}

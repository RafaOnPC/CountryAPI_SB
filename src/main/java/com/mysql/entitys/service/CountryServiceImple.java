package com.mysql.entitys.service;

import com.mysql.entitys.dto.CountryDTO;
import com.mysql.entitys.mapper.CountryMapper;
import com.mysql.entitys.model.Country;
import com.mysql.entitys.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImple implements CountryService{

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public CountryDTO saveCountryDTO(CountryDTO countryDTO) {
        Country country = countryMapper.toCountry(countryDTO);
        return countryMapper.toCountryDTO(countryRepository.save(country));
    }

    @Override
    public List<CountryDTO> getCountrys() {
        return countryMapper.toListCountryDTO(countryRepository.findAll());
    }

    @Override
    public CountryDTO getCountry(Long countryId) {
        return countryMapper.toCountryDTO(countryRepository.findById(countryId).get());
    }

    @Override
    public CountryDTO updateCountryEntity(Long countryId, CountryDTO countryDTO) {
        Country country = countryRepository.findById(countryId).get();
        countryMapper.updateCountry(countryDTO, country);
        return countryMapper.toCountryDTO(countryRepository.save(country));
    }

    @Override
    public CountryDTO deleteCountry(Long countryId) {
        Country country = countryRepository.findById(countryId).get();
        countryRepository.deleteById(countryId);
        return countryMapper.toCountryDTO(country);
    }
}

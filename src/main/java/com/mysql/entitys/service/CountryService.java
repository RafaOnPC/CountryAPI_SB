package com.mysql.entitys.service;

import com.mysql.entitys.dto.CountryDTO;

import java.util.List;


public interface CountryService {

    public CountryDTO saveCountryDTO(CountryDTO countryDTO);

    public List<CountryDTO> getCountrys();

    public CountryDTO getCountry(Long countryId);

    public CountryDTO updateCountryEntity(Long countryId, CountryDTO countryDTO);

    public CountryDTO deleteCountry(Long countryId);
}

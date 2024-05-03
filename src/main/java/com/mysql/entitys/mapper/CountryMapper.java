package com.mysql.entitys.mapper;

import com.mysql.entitys.dto.CountryDTO;
import com.mysql.entitys.model.Country;

import java.util.List;

public interface CountryMapper {

    public CountryDTO toCountryDTO(Country country);

    public Country toCountry(CountryDTO countryDTO);

    public List<CountryDTO> toListCountryDTO(List<Country> countryList);

    public void updateCountry(CountryDTO countryDTO, Country country);

}

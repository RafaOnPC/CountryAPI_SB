package com.mysql.entitys.mapper;

import com.mysql.entitys.dto.CountryDTO;
import com.mysql.entitys.model.Country;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMapperImple implements CountryMapper{
    @Override
    public CountryDTO toCountryDTO(Country country) {
        if(country == null){
            return null;
        }

        CountryDTO countryDTO = new CountryDTO();
        countryDTO.setId(country.getId());
        countryDTO.setName_country(country.getName());
        countryDTO.setName_capital(country.getCapital());


        return countryDTO;
    }

    @Override
    public Country toCountry(CountryDTO countryDTO) {
        if(countryDTO == null){
            return null;
        }

        Country country = new Country();
        country.setId(countryDTO.getId());
        country.setName(countryDTO.getName_country());
        country.setCapital(countryDTO.getName_capital());

        return country;
    }

    @Override
    public List<CountryDTO> toListCountryDTO(List<Country> countryList) {
        List<CountryDTO> countryDTOS = new ArrayList<>(countryList.size());
        for(Country countrys: countryList){
            countryDTOS.add(toCountryDTO(countrys));
        }
        return countryDTOS;
    }

    @Override
    public void updateCountry(CountryDTO countryDTO, Country country) {

        if(countryDTO == null){
            return;
        }

        country.setId(countryDTO.getId());
        country.setName(countryDTO.getName_country());
        country.setCapital(countryDTO.getName_capital());
    }
}

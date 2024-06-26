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

        return CountryDTO.builder()
                .id(country.getId())
                .name_country(country.getName())
                .name_capital(country.getCapital())
                .build();
    }

    @Override
    public Country toCountry(CountryDTO countryDTO) {
        if(countryDTO == null){
            return null;
        }

        return Country.builder()
                .id(countryDTO.getId())
                .name(countryDTO.getName_country())
                .capital(countryDTO.getName_capital())
                .build();
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

package com.mysql.entitys.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    private Long id;
    private String name_country;
    private String name_capital;
}

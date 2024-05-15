package com.mysql.entitys.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    private Long id;
    private String name_country;
    private String name_capital;
}

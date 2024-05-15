package com.mysql.entitys.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Paises")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_country", nullable = false, length = 255)
    private Long id;

    @Column(name = "country_name", nullable = false, length = 255)
    private String name;

    @Column(name = "capital_name", nullable = false, length = 255)
    private String capital;
}
